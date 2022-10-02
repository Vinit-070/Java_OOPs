/*
     Author : Vinit Patel.
  - Create a class Student which has data members enrollment no, exam no and student name.
  - Create class Exam by inheriting Student class and having fields to store marks scored in
        three subjects. It has mehod to calculate results.
  - Write a program to print results for two students.
 => Note : Implement this using all usage of super keyword. 
 */
import java.util.*;


class Student
{
    Long enroll_no, exm_no;
    String s_name;
    float r;
}
class Exam extends Student
{
    Scanner sc = new Scanner(System.in);
    float m1, m2, m3;
    
    void getdata()
    {
        System.out.println("Enter Student's Name : ");
        super.s_name = sc.nextLine();
        System.out.println("Enter Enrollment no. : ");
        super.enroll_no = sc.nextLong();
        System.out.println("Enter Exam no. : ");
        super.exm_no = sc.nextLong();
        System.out.println("Enter marks of Subject 1 : ");
        m1 = sc.nextFloat();
        System.out.println("Enter marks of Subject 2 : ");
        m2 = sc.nextFloat();
        System.out.println("Enter marks of Subject 3 : ");
        m3 = sc.nextFloat();
    }
    float clac_res()
    {
        float m, t;
        
       m = m1 + m2 + m3;
       t = 240;
       super.r = (t/m)*100;
       return super.r;
    }
}
    class DisplayData extends Exam
    {
        void display()
        {
            System.out.println("Student's Name : "+super.s_name);
            System.out.println("Enrollment no. : "+super.enroll_no);
            System.out.println("Exam no. : "+super.exm_no);
            System.out.println("Result of "+super.s_name+" is : " +super.r);


        }
    } 

public class result
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter number of Students : ");   
        n = s.nextInt();
        DisplayData st[] = new DisplayData[n];
        for(int i=0; i<n; i++)
        {
            st[i] = new DisplayData();
            st[i].getdata();
        }
        for(int i=0; i<n; i++)
        {
            st[i].display();
        }
    }
}