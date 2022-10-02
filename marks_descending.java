/*   
Author : Vinit Patel.
Write a program to take marks of five students and print the marks of students in descending order. 
*/
import java.util.*;
public class marks_descending 
{
    public static void main(String[] args)
    {
        int a[] = new int [20];
        int i,j,s,c;
        s=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks below ");
        for(i=0; i<s; i++)
        {
            System.out.println("Subject "+(i+1)+" marks : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Marks in Descending Order : ");
        for (i=0; i<s; i++)
        {
            for(j=i+1; j<s; j++)
            {
                if(a[i] < a[j])
                {
                    c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
            System.out.println(a[i]);
        }
    }
}
