class Animal 
{
    void Type() 
    {
        System.out.println("Animals in the class are : \n");
    }
}

class Dog extends Animal 
{
    void Type() 
    {
        System.out.println("There is a Dog ");
    }
}

class Horse extends Animal 
{
    void Type() 
    {
        System.out.println("There is a horse ");
    }
}

class poly
{
    public static void main(String args[])
    {

        Animal animal1 = new Dog();
        Animal animal2 = new Horse();

        animal1.Type();
        animal2.Type();

    }    
}
