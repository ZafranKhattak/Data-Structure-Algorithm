class Student
{
     int studentId ;
    String studentName ;
    int studentAge ;
    double studentCGPA ;
    double studentInterPercentage;

    public Student(int studentId ,
    String studentName ,
    int studentAge ,
    double studentCGPA ,
    double studentInterPercentage)
    {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentCGPA = studentCGPA;
        this.studentInterPercentage = studentInterPercentage;
        this.studentAge = studentAge;
    }
}

// ================= SINGLY LINKEDLIST =====================
class Node 
{
    Student std;
    Node next;

    public Node (Student std)
    {
        this.std = std;
        this.next = null;
    }
}

//  ================= StudentQueue =======================
class StudentQueue{
    Node front;
    Node back;
    int count;

    public  StudentQueue()
    {
       front = null;
       back = null;
       this.count = 0;
    }

    // ================ ENQUEUE METHOD ==================

    void enqueue(Student student)
    {
        Node addStudent = new Node(student);
        if(isEmpty())
        {
            front = addStudent;
            back = addStudent;
        }
        back.next = addStudent;
        back = addStudent;
        count++;
    }

    // =============== DEQUEUE METHOD ================
    Student  dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Emtpy");
            return null ;
        }

        Student std = front.std;
        front = front.next;
        count--;
        return  std;
    }

    // ================ ISEMTPY METHOD ==================
    boolean isEmpty()
    {
        return  count == 0;
    }

    // ================ PEEK METHOD ================
    Student peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Emtpy");
            return  null;
        }
        return  front.std;
    }

    // =============== SIZE METHOD 
    int Size()
    {
        return  count;
    }

    // ================ DISPLAY METHOD ===============
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.println("Student ID: " + temp.std.studentId);
            System.out.println("Name: " + temp.std.studentName);
            System.out.println("Age: " + temp.std.studentAge);
            System.out.println("CGPA: " + temp.std.studentCGPA);
            System.out.println("Intermediate Percentage: " + temp.std.studentInterPercentage);
            System.out.println();

            temp = temp.next;
        }
    }

}

//      ================ MAIN CLASS =================
public class Main {
    public static void main(String args[])
    {
         StudentQueue queue = new StudentQueue();

        Student s1 = new Student(101, "Ali", 21, 3.2, 75.5);
        Student s2 = new Student(102, "Ahmed", 20, 2.8, 68.0);
        Student s3 = new Student(103, "Sara", 22, 3.7, 85.0);
        Student s4 = new Student(104, "Ayesha", 19, 3.5, 80.0);

        queue.enqueue(s1);
        queue.enqueue(s2);
        queue.enqueue(s3);
        queue.enqueue(s4);

        System.out.println("Students in Queue:");
        queue.displayQueue();

        System.out.println("Queue Size: " + queue.Size());

        System.out.println();

        System.out.println("Front Student:");
        Student frontStudent = queue.peek();
        System.out.println(frontStudent.studentName + " - " + frontStudent.studentCGPA);

        System.out.println();

        System.out.println("Dequeue Student:");
        Student removedStudent = queue.dequeue();
        System.out.println(removedStudent.studentName + " - " + removedStudent.studentCGPA);

        System.out.println();

        System.out.println("Queue After Dequeue:");
        queue.displayQueue();

        System.out.println("Queue Size: " + queue.Size());

        System.out.println();

        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }

    }


