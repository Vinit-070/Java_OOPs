/* Author : Vinit Patel
    - Write a java program to find out the payroll system using single inheritance.
    - Create one base class and one derived class.
    - The base class "Emp" contains the data members: 
       -> emp_name, emp_no, designation.
    - The derived class "salary" contains the data members:
       -> Basicpay, home rent allowance (HRA).
    => Write a program to calculate salary for 5 employees.
        Formula for calculating salary [Salary = Basicpay + HRA * (Basicpay) + HRA] 
*/
import java.util.Scanner;
class Emp
{
    String emp_name, deg;
    long emp_no;
    void getdata1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name : ");
        emp_name = sc.nextLine();
        System.out.print("Enter Employee Designation : ");
        deg = sc.nextLine();
        System.out.print("Enter Employee No. : ");
        emp_no = sc.nextLong();
        
    }
    void disp1()
    {
        System.out.println("Employee No. : "+emp_no);
        System.out.println("Employee Name : "+emp_name);
        System.out.println("Employee Designation : "+deg);
    }
}
class salary extends Emp
{
    String emp_name, deg;
    long emp_no;
    int basic_pay, hra, salary;
    void getdata2()
    {
        Scanner sc = new Scanner(System.in);
        super.getdata1();
        System.out.print("Enter Employee's Basicpay : ");
        basic_pay = sc.nextInt();
        System.out.print("Enter Employee's HRA : ");
        hra = sc.nextInt();
        salary = basic_pay+hra*(basic_pay)+hra;
    }
    void disp2()
    {
        super.disp1();
        System.out.println("Employee's Basicpay : "+basic_pay);
        System.out.println("Employee's HRA : "+hra);
        System.out.println("Employee's Salary : "+salary);
    }
}
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Employees whose salary you want to calculate : ");
        int n = sc.nextInt();
        salary s[] = new salary[n];
        for(int i=0;i<n; i++)
        {
            s[i] = new salary();
            s[i].getdata2();
            s[i].disp2();
        }
    }
}