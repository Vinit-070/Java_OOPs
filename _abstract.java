/*
Author : Vinit Patel.
    - Create an abstract class Department with data members university, collage,
      method display() and abstract method subject_list().
    -  Create subclass CE and EE which implements the method subject_list()
    -  Write a program to display subjects offered by CE and EE Departments. 
*/ 
import java.util.*;
abstract class Department
{
    Scanner sc = new Scanner(System.in);
    String uni, clg;
    void display()
    {
        System.out.print("Enter University Name : ");
        uni = sc.nextLine();
        System.out.print("Enter Collage Name : ");
        clg = sc.nextLine();
        System.out.println("University : "+uni);
        System.out.println("Collage : "+clg);
    }
    abstract void subject_list();
}
class CE extends Department
{
    Scanner sc = new Scanner(System.in);
    String cs1, cs2, cs3;
    void subject_list()
    {
        super.display();
        System.out.println("Subjects Offered by CE Department");
        System.out.print("Enter Subject 1 : ");
        cs1 = sc.nextLine();
        System.out.print("Enter Subject 2 : ");
        cs2 = sc.nextLine();
        System.out.print("Enter Subject 3 : ");
        cs3 = sc.nextLine();
        System.out.println("Subject 1 : "+cs1);
        System.out.println("Subject 2 : "+cs2);
        System.out.println("Subject 3 : "+cs3+"\n");
    }
}
class EE extends Department
{
    Scanner sc = new Scanner(System.in);
    String es1, es2, es3;
    void subject_list()
    {
        super.display();
        System.out.println("Subjects Offered by EE Department");
        System.out.print("Enter Subject 1 : ");
        es1 = sc.nextLine();
        System.out.print("Enter Subject 2 : ");
        es2 = sc.nextLine();
        System.out.print("Enter Subject 3 : ");
        es3 = sc.nextLine();
        System.out.println("Subject 1 : "+es1);
        System.out.println("Subject 2 : "+es2);
        System.out.println("Subject 3 : "+es3);
    }
}
class _abstract
{
    public static void main(String[] args) 
    {
        Department d1 = new CE();
        Department d2 = new EE();
        d1.subject_list();
        d2.subject_list();
    }
}
