import java.util.Scanner;

class Asst_2 
{
    public static void main(String args[])
    {
        int number,option,x;
        Scanner input = new Scanner(System.in);
        
        System.out.println("----- CALCULATOR MENU -----");
        System.out.println("option 1 : To check Arithmeatic Exception   ");
        System.out.println("option 2 : To check Exception of IllegalArgumentException");
        System.out.println("option 3 : Code Exit");

        do
        {
                System.out.print("\ninput Option : ");
                option = input.nextInt();   
            switch(option)
            {
                case 1:
                try
                {
                    System.out.print("\nFormula  here is = n / 0 \n");
                    System.out.println("Enter a number : ");
                    number = input.nextInt();

                    System.out.println("value Entered is : "+number );
                    x = number / 0;
                    System.out.println(""+x );

        
                }

                catch(ArithmeticException e)  //better for / by zero error msgs 
                {
                    System.out.println("Error occurred: " + e.getMessage());
                }

                finally 
                {
                    System.out.println("This Code Works Fine !" );
                }


                System.out.println("\n------------------------\n\n");
                break;

                case 2:
                try
                {
                    System.out.println("Enter an Age : ");
                    number = input.nextInt();
                    System.out.println("Age Entered is : "+ number );
                    if (number < 0) 
                    {
                        throw new IllegalArgumentException("Age cannot be negative.");
                    }

                    else if(number >= 110)
                    {
                        throw new IllegalArgumentException("Age cannot be Above 110.");
                    }
        
                }

                catch(IllegalArgumentException ex) 
                {
                System.out.println("Error occured : " + ex.getMessage());
                }

                finally 
                {
                    System.out.println("This Code Works Fine !" );
                }

                
                System.out.print("\n------------------------\n\n");
                break;

                case 3:
                System.out.print("Code Exited !");
                break;

                default:
                System.out.println("Please Enter only valid option from menu ");
                System.out.print("\n------------------------\n\n");
                break;

            }
        }while(option!=3);

        input.close();
    }
}
