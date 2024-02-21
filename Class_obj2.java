class Student
{
    void Stud_name()
    {
        System.out.println("Name : Merwin Pinto");
    }
}

class Marks
{
    void Stud_marks()
    {
        System.out.println("Java Marks : 100 ");
    }
}

class Branch
{
    void Stud_div()
    {
        System.out.println("AI & DS Branch ");
    }
}

class Class
{
    void Stud_class()
    {
        System.out.println("SY : DIV E");
    }
}

class Class_obj2
{
    public static void main(String args[])
    {        
        Student obj1 = new Student();
        Marks   obj2 = new Marks();
        Branch obj3 = new Branch();
        Class obj4 = new Class();

        obj1.Stud_name();
        obj2.Stud_marks();
        obj3.Stud_div();
        obj4.Stud_class();

        
    }
    
}
