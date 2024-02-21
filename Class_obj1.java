//Class and object implementation
class Sample
{
    public float a = 5;
    // private int b = 9;
    protected int c = 2002;
    
    void Sample1()
    {
        System.out.println("Hello this is a sample !");
    }
}

public class Class_obj1
{
    public static void main(String args[])
    {
        Sample obj1 = new Sample();
        obj1.Sample1();

        
        System.out.println("The public number is : "+obj1.a);
        // System.out.println("The private number is : "+obj1.b);
        System.out.println("The Protected number is : "+obj1.c);
        
    }
}