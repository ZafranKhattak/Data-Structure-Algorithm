class Animal
{
    void eat()
    {
        System.out.print("Animal eat");
    }
    
}

class Dog extends Animal
{
    void eat()
    {
        super.eat();
        System.out.print("Dog eat");
    }
}

class Super
{
    public static void main(String[] args) {
        
        Animal dog = new Dog();
        dog.eat();
        
    }
}