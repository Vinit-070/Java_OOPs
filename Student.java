/*  
    Author : Vinit Patel.
    Define a class Student which contais the following :

  -> Data Members :
      - Name of Student.
      - Enrollment Number of Student.
      - Contact Number of Student.

  -> Member Functions :
       - To get details of Student.
       - To display details of Student.

    Write a program to display details of one Student.

 */
import java.util.*;
class Students
{
    String name, enroll, cont;
    Scanner sc = new Scanner (System.in);

    void getdata()
    {
        System.out.print("Enter Name of Student : ");
        name = sc.nextLine();

        System.out.print("Enter Enrollment Number of Student : ");
        enroll = sc.nextLine();

        System.out.print("Enter Contact Number of Student : ");
        cont = sc.nextLine();
    }

    void displaydata()
    {
        System.out.println("Name of Student : "+name);
        
        System.out.println("Enrollment Number of Student : "+enroll);
        
        System.out.println("Contact Number of Student : "+cont);
        
    }
}
 public class Student
 {
    public static void main(String[] args) 
    {
        Students s1 = new Students();
        s1.getdata();
        s1.displaydata();
    }
 }