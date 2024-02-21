import java.util.*;

class Sample_Thread implements Runnable   //I have created a Thread that implements Runnable algo 
{
    private String Batch;
    private int n;
    
    public Sample_Thread(String Batch , int n)   //I have created a constructor to access the Private variables 
    {
      this.Batch = Batch;
      this.n = n;
    }
    
    public void run()  //I have created a function that Executes the data
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nBatch Thread " + Batch + "\nRoll_call " + (i+1) + " present \n");

            try 
            {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) 
            {

            }
        }
    }
}
  
public class Multithread
{
    public static void main(String[] args) 
    {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Batch : ");
    String Name1 = input.next();

    System.out.println("Enter Batch : ");
    String Name2 = input.next();

    System.out.println("Enter count for threads : ");
    int n = input.nextInt();

    Thread thread1 = new Thread(new Sample_Thread(Name1,n));
    Thread thread2 = new Thread(new Sample_Thread(Name2,n));
      
    thread1.start();
    thread2.start();

    input.close();
    }
}