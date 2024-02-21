
// // Single inheritance ------------------------------------------>>>
// class Student
// {
//     void Stud_name()
//     {
//         System.out.println("Name : Merwin Pinto");
//     }
// }

// class Marks extends Student
// {
//     void Stud_marks()
//     {
//         System.out.println("Java Marks : 100 ");
//     }
// }

// class Inherit
// {
//     public static void main(String args[])
//     {        
//         Marks obj1 = new Marks();
//         obj1.Stud_name();
//         obj1.Stud_marks();
//     }
    
// }


// //Hierarchical inheritance ------------------------------------------>>>
// class test_class
// {
//   int Num = 10;
// }

// class Class1 extends test_class
// {
//   int Num1 = 1;
// }

// class Class2 extends test_class
// {
//   int Num2 = 2;
// }

// class Class3 extends test_class
// {
//   int Num3 = 3;
// }

// class Inherit
// {
//   public static void main(String args[])
//   {
//     Class1 Obj1 = new Class1 ();
//     Class2 Obj2 = new Class2 ();
//     Class3 Obj3 = new Class3 ();

//     System.out.println("Num * Num1 = " + Obj1.Num * Obj1.Num1);	
//     System.out.println("Num * Num2 = " + Obj2.Num * Obj2.Num2);
//     System.out.println("Num * Num3 = " + Obj3.Num * Obj3.Num3);
//   }
// }


// //Hybrid Inheritance
// class Animal 
// {
//     void eat() 
//     {
//         System.out.println("Animal is eating...");
//     }
// }

// interface Pet 
// {
//     void Roll();
// }

// class Dog extends Animal implements Pet 
// {
//     void bark() 
//     {
//         System.out.println("Bark");
//     }

//     public void Roll() 
//     {
//         System.out.println("Roll");
//     }
// }


// class doberman extends Dog 
// {
//     void jump() 
//     {
//         System.out.println("jump");
//     }
// }

// class Inherit 
// {
//     public static void main(String[] args) 
//     {
//         doberman doberman = new doberman();
//         doberman.eat();
//         doberman.bark();
//         doberman.jump(); 
//         doberman.Roll(); 
//     }
// }




//multilevel inheritance ------------------------------------------>>>
class Student
{
    void Stud_name()
    {
        System.out.println("Name : Merwin Pinto");
    }
}

class Marks extends Student
{
    void Stud_marks()
    {
        System.out.println("Java Marks : 100 ");
    }
}

class Branch extends Marks
{
    void Stud_div()
    {
        System.out.println("AI & DS Branch ");
    }
}

class Class extends Branch
{
    void Stud_class()
    {
        System.out.println("SY : DIV E");
    }
}

class Inherit
{
    public static void main(String args[])
    {        
        Class obj1 = new Class();
        obj1.Stud_name();
        obj1.Stud_marks();
        obj1.Stud_div();
        obj1.Stud_class();
    }
    
}

// // multiple inheritance ------------------------------------------->
// interface Student
// {
//   void Study();
//   void Class();
// }

// interface Teacher 
// {
//   void Teach();
// }

// class School implements Student,Teacher
// {
//   public void Study()
//   {
//     System.out.println("Student Studies");
//   }
  
//   public void Class()
//   {
//     System.out.println("Student is of class 10th STD ");
//   }
  
//   public void Teach() 
//   {
//     System.out.println("teacher Teaches in the School");
//   }
// }

// public class Inherit {
//   public static void main(String[] args)
//   {
//      School obj1 = new School();
//      obj1.Study();
//      obj1.Class();
//      obj1.Teach();

//   }
// }