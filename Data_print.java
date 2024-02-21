//Program to store a string / char / float  in a variable and print out on Screen

public class Data_print 
{
    public static void main(String[] args)
    {
        String Name;
        char Alpha;
        int Num1;
        float Num2;

        Name = "Merwin Pinto";
        Alpha = 'a';
        Num1 = 5;
        Num2 = 7.0f;

        System.out.println("Printing assigned String = "+ Name);
        System.out.println("Printing assigned char = "+ Alpha);
        System.out.println("Printing assigned integer = "+ Num1);
        System.out.println("Printing assigned Float = "+ Num2);
        System.out.println("Printing assigned Float = "+ (Num1 + Num2) );
    }
    
}
