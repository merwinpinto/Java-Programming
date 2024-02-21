
abstract class Shape 
{
    abstract void Display();
}

class Circle extends Shape 
{
    void Display() 
    {
        System.out.println("Word : Circle ");
    }
}

public class Abstrac
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle();
        circle.Display();
    }
}

