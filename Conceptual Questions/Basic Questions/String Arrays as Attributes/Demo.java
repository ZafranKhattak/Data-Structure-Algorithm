class Demo
{
    String [] subjectNames;

    Demo(String [] subjectNames)
{
    this.subjectNames = subjectNames;
}

void display()
{
    for (String subject : subjectNames)
    {
        System.out.print(subject + " ");
    }
}

}


class Test
{
    public static void main(String[] args) {
        
        String[] subjects = {"Math", "Science", "English"};

        Demo inp = new Demo(subjects);

        inp.display();
    }
}