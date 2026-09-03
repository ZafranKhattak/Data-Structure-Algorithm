/* 
       Zafran Ullah Khan
       Section A
       CMS ID : 053-25-0035
*/

class Student
{
    int studentId;
    String name;
    String department;
    String semester;
    double cgpa;

    Student(int studentId,
    String name,
    String department,
    String semester,
    double cgpa
                )
                {
                    this.studentId = studentId;
                    this.name = name;
                    this.department = department;
                    this.semester = semester;
                    this.cgpa = cgpa;
                }
}

class Node 
{
    
    Student data;
    Node next;

    Node (Student data)
    {
        this.data = data;
        this.next = null;
    }
}

class StudentLinkedList
{
    Node head;
    Node tail ;

    StudentLinkedList()
    {
        this.head = null;
        this.tail = null;
    }


    // ADD STUDENT AT FRONT METHOD
    void  addStudentFront(Student std) 
    {
        Node newNode = new Node(std);
            if(head == null)
            {
                head = newNode;
                tail = newNode;
                return;
            }else{
                head.next = newNode;
                head = newNode;
            }

            System.out.println("Student " + std.name + " Added at Front");

    }

    // ADD STUDENT AT BACK METHOD

    void addStudentBack(Student std)
    {
        Node newNode = new Node(std);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        else 
        {
            tail.next = newNode;
            tail = newNode;
        }

        System.out.println("Student " + std.name + " is Added at Back");
    }

    // DELETE FROM FRONT
    void  deleteStudentFront()
    {
        if (head == null)
        {
            System.out.print("List is Empty");
            return;
        }

        head.next = head;

        if(head == null)
        {
            tail = null;
            return;
        }
    }
    
    // DELETE FROM BACK
    void deleteStudentBack()
    {
        if(head == null)
        {
            System.out.print("List is empty");
            return;
        }

        if(head == tail)
        {
            head = null;
            tail = null;
            return;
        }

        Node current = head;

        while (current != tail) {
            
            current = current.next;
        }

        current.next = null;
        tail = current;
    }

    // search student

    void searchStudent(int id)
    {
        if(head == tail)
        {
            System.out.print("List is Empty");
            return;
        }

        Node current  = head;

        while(current.next != tail)
        {
                if (current.data.studentId == id)
                {
                    System.out.print("Student Found " + current.data.name + " " +
                                        current.data.studentId + " " + 
                                        current.data.department + " " +
                                        current.data.semester + " " + 
                                        current.data.cgpa
                    );
                }

                current = current.next;
        }

        System.out.print("Student not found");
    }

    // DELETE STUDENT

    void deleteStudent(int id)
    {
        if(head == tail)
        {
            System.out.print("List is Empty");
            return;
        }

       Node current = head;

        while (current.next.next != null) {

            current = current.next;
        }
    }

    // ADDAFTER METHOD

    void addStudentAfter(int target , Student newStd)
    {
        Node current = head;

        while(current !=null)
        {
            if (current.data.studentId == target)
            {
                Node newNode = new Node(newStd);
                newNode.next = current.next;

                current.next = newNode;
            }

            current = current.next;
        }
    }


    // ADD BEFORE METHOD

    void addStudentBefore(int target , Student newStd)
    {
        if(head == null)
        {
            System.out.print("List is Empty");
            return;
        }
        Node current = head;

         while(current !=null)
        {
            if (current.data.studentId == target)
            {
                Node newNode = new Node(newStd);
                newNode.next = current.next;

                current.next = newNode;
            }

            current = current.next;
        }
    }

    // displayStudents()
    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println(" All Student Records");
        Node current = head;
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }

    // updateStudent()
    public void updateStudent(int studentId, String newName, String newDept, String newSem, double newCgpa) {
        Node current = head;
        while (current != null) {
            if (current.data.studentId == studentId) {
                current.data.name = newName;
                current.data.department= newDept;
                current.data.semester= newSem;
                current.data.cgpa = newCgpa;
                System.out.println("Updated information for student ID " + studentId);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with ID " + studentId + " not found. Cannot update.");
    }
}


class Main 
{
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // AT FRONT
        list.addStudentFront(new Student(1, "Zafran", "SE", "3rd", 3.42));

        // AT BACK

        list.addStudentBack(new Student(3, "Zafar", "SE", "3rd", 3.62));

        // DISPLAY STUDENT
        list.displayStudents();

        // SEARCH STUDENT
        list.searchStudent(3);

        // UPDATE
        list.updateStudent(1, "Kamran", "EE", "4th", 3.89);

        // ADD BEFORE
        list.addStudentBefore(1,new Student(4, "Noor Fatima", "Biology", "3rd", 3.60));

        // ADD STUDENT AFTER
        list.addStudentAfter(4 ,new Student(4, "Marwa", "Biology", "3rd", 3.60));

        // DELETE 
        list.deleteStudent(1);
        
        // delete front
        list.deleteStudentFront();

        // delete back

        list.deleteStudentBack();

        // DISPLAY
        list.displayStudents();
    }
}