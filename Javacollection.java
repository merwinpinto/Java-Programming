import java.util.Scanner;
import java.util.*;
public class Javacollection 
{
   public static void main(String args[])
   {
    String First_name,Last_name,Middle_name;
    int size;
    int i;
    
    //ARRAY LIST 
    Scanner obj1 = new Scanner(System.in);
    System.out.println("\nARRAY Program  ");
    System.out.println("\nHow many numbers would you like to take input :  ");
    int val = obj1.nextInt();
    ArrayList<Integer> a1 = new ArrayList<>();
    for(i=0; i<val; i++)
    {
        
        System.out.println("\ninput number :  "+(i+1));
        int num = obj1.nextInt();
        a1.add(num);
    }
    
        System.out.println("Array 1  : "+a1);
    


        
    //SET
    HashSet<String> b1 = new HashSet<>();   // data entered may occur  randomly not in sequenc like arrays
    System.out.println("\nHash set\n  ");
    System.out.println("\ninput 1 = Anil\n  ");
    System.out.println("\ninput 2 = 20 \n  ");
    b1.add("Anil");
    b1.add("20");
    System.out.println("Array 2  : "+b1);
    System.out.println("\n");
    
    
    //LINKLIST 
    System.out.println("LINKLIST Program  ");
    LinkedList<String> list = new LinkedList<>();
    list.add("Merwin");
    list.add("Mohan");
    list.add("Pinto");

    First_name = list.getFirst(); 
    Middle_name = list.get(1);
    Last_name = list.getLast();
    size = list.size();

    System.out.println("Fname  : "+First_name);
    System.out.println("Mname  : "+Middle_name);
    System.out.println("Lname  : "+Last_name);
    System.out.println("Size of List  : "+size);
    System.out.print(" My Full Name is : ");
    for (String s : list) 
    {
        System.out.print(" "+s);
    }

    //     add(E e) - adds the specified element to the end of the list
    // get(int index) - returns the element at the specified position in the list
    // remove(int index) - removes the element at the specified position in the list
    // removeFirst() - removes and returns the first element in the list
    // removeLast() - removes and returns the last element in the list
    // size() - returns the number of elements in the list
    // iterator() - returns an iterator over the elements in the list.

    
    
    //VECTOR
    System.out.println("\n\nVECTOR Program  ");
    Vector<String> vector_list = new Vector<>();
    vector_list.add("Merwin");
    vector_list.add("Mohan");
    vector_list.add("Pinto");

    First_name = vector_list.firstElement(); 
    Middle_name = vector_list.get(1);
    Last_name = vector_list.lastElement();
    size = vector_list.size();

    System.out.println("Fname  : "+First_name);
    System.out.println("Mname  : "+Middle_name);
    System.out.println("Lname  : "+Last_name);
    System.out.println("Size of Vector  : "+size);
    System.out.print(" My Full Name is :");
    for (String s : vector_list) 
    {
        System.out.print(" "+s);
    }
    //add(E e) - adds the specified element to the end of the vector
    // get(int index) - returns the element at the specified position in the vector
    // removeElement(Object obj) - removes the first occurrence of the specified element from the vector, if it is present
    // removeElementAt(int index) - removes the element at the specified position in the vector
    // firstElement() - returns the first element in the vector
    // lastElement() - returns the last element in the vector
    // size() - returns the number of elements in the vector
    // elements() - returns an Enumeration of the elements in the vector.

    //STACK
    System.out.println("\n\nSTACK Program  ");
    Stack<Integer> stk= new Stack<>();
    System.out.println("\nHow many numbers would you like to take input :  ");
    int val2 = obj1.nextInt();
    for(i=0; i<val2; i++)
    {
        
        System.out.println("\ninput number :  "+(i+1));
        int num2 = obj1.nextInt();
        stk.push(num2);
        
    }


    System.out.println("\nHow many numbers would you like pop from stack :  ");
    int val3 = obj1.nextInt();
    for(i=0; i<val3; i++)
    {
        stk.pop();
    }

    System.out.print("Elements in Stack are : "+stk);

    // push(E item) - adds the specified item to the top of the stack
    // pop() - removes and returns the top item from the stack
    // peek() - returns the top item from the stack without removing it
    // isEmpty() - returns true if the stack is empty, false otherwise
    // search(Object o) - returns the 1-based position of the specified object in the stack, or -1

}   
}
