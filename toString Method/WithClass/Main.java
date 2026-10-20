class Student 
{
    String name ;
    int age ;

    public Student(String name , int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override 
    public String toString()
    {
        return  "Name :" + name + ", age: "  + age;
    }
}

class Main 
{
    public static void main(String[] args) {
        
        Student s = new Student("Zafran Khan", 20);

      
        System.out.println(s);
    }
}