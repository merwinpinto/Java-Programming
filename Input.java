import java.util.Scanner;

class Input
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number integer : ");
        int num1 = input.nextInt();

        System.out.print("Enter a number float : ");
        Float num2 = input.nextFloat();

        System.out.print("Enter a string: ");
        String var = input.next();

        System.out.println("int Number entered is : "+num1);

        System.out.println("float Number entered is : "+num2);

        System.out.println("String entered is  : "+var);

        input.close();
    }
}