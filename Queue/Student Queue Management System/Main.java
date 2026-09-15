// ==================== STUDENT CLASS ====================
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

// ============= QUEUE CLASS ==============
class CircularQueue 
{
    int front;
    int back;
    int count ;
    int size;
    Student array[];

    public CircularQueue(int size)
    {
        this.size = size;
        this.count = 0;
        this.front = 0;
        this.back = -1;
        array = new Student[size];
    }

    void enQueue(Student std)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            return ;
        }

       back = (back + 1) % size;
       array[back] = std;
       count++;

    }
    boolean isEmpty() 
    {
        return count == 0;
    }

    // DEQUEUE METHOD;
    void deQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Emtpy");
            return;
        }

        front = (front + 1) % size;
        Student value = array[front];
        System.out.println("Value " + value + " has been removed");
        count--;
    }
    //  FULL METHOD
    boolean isFull()
    {
        return count == size;
    }
    // PEEK METHOD
   Student peek()
   {
     if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return  null;
        }
        return array[front];
   }

   // =============== DISPLAY METHOD =====================;
   void display()
{
    if (isEmpty())
    {
        System.out.println("Queue is Empty");
        return;
    }

    int index = front;

    for (int i = 0; i < count; i++)
    {
        System.out.println(array[index]);
        index = (index + 1) % size;
    }
}
}
// ============== MAIN CLASS ==============
public class Main 
{
    public static void main(String args[])
    {
        CircularQueue queue = new CircularQueue(5);
        Student s1 = new Student(1, "Ali", 20, 3.5, 80.0);
        Student s2 = new Student(2, "Ahmed", 21, 3.2, 75.0);
        Student s3 = new Student(3, "Sara", 20, 3.8, 85.0);

        queue.enQueue(s1);
        queue.enQueue(s2);
        queue.enQueue(s3);

        queue.display();
    }
}