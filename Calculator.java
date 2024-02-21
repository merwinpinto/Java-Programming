import java.util.Scanner;
class Calculator 
{
    public static void main(String args[])
    {
        int option;
        float num1,num2;
        Scanner input = new Scanner(System.in);

        System.out.println("----- CALCULATOR MENU -----");
        System.out.println("option 1 : Addition ");
        System.out.println("option 2 : Subtraction ");
        System.out.println("option 3 : Multiplication");
        System.out.println("option 4 : Division");
        System.out.println("option 5 : Code Exit");

        System.out.println("\nTake inputs for num1 and num2");
        System.out.print("Input num1 :");
        num1 = input.nextFloat();

        System.out.print("\nInput num1 :");
        num2 = input.nextFloat();

        do
        {
                System.out.print("\ninput Option : ");
                option = input.nextInt();   
            switch(option)
            {
                case 1:
                System.out.println("Performing Addition");
                System.out.print("Result : "+(num1 + num2));
                System.out.println("\n------------------------\n\n");
                break;

                case 2:
                System.out.println("Performing Subtraction");
                System.out.print("Result : "+(num1 - num2));
                System.out.print("\n------------------------\n\n");
                break;

                case 3:
                System.out.println("Performing Multiplication");
                System.out.print("Result : "+(num1 * num2));
                System.out.print("\n------------------------\n\n");
                break;

                case 4:
                System.out.println("Performing Division");
                System.out.print("Result : "+(num1 / num2));
                System.out.print("\n------------------------\n\n");
                break;

                case 5:
                System.out.print("Code Exited !");
                break;

                default:
                System.out.println("Please Enter only valid option from menu ");
                System.out.print("\n------------------------\n\n");
                break;

            }
        }while(option!=5);

        input.close();
    }
}
