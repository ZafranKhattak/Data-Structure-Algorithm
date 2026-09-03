class Employee {
    static int employeeCount = 0;
    String name;

    Employee(String name) {
        this.name = name;
        employeeCount++;
    }

    void displayEmployee() {
        System.out.println("Name: " + name + ", Count: " + employeeCount);
    }

    public static void main(String[] args) {
        
    
    Employee e1 = new Employee("Ali");
    e1.displayEmployee();
    Employee e2 = new Employee("Sara");
    e2.displayEmployee();
    Employee e3 = new Employee("Ahmed");
    e3.displayEmployee();
    }
}