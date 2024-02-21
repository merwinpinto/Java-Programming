import java.util.Scanner;

class Person 
{
    private int Age;

    public void setAge(int Age) 
    {
      this.Age = Age;
    }

    public int getAge() 
    {
      return Age;
    }

}
  
class Encap
{
  public static void main(String[] args) 
  {
    int num;
  
    Scanner inp = new Scanner(System.in);
    Person p1 = new Person();

    System.out.print("Input your Age :");
    num = inp.nextInt();
    p1.setAge(num);
      
    System.out.println("My Age is " + p1.getAge());

    inp.close();
  }
}