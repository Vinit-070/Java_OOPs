/* 
Author : Vinit Patel.
Write a program to find Factorial of a given number.
*/
import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
    {
        int i, n, f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        for(i=n; i>1; i--)
        {
            f = f * i;
        }
        System.out.println("Factorial of " +n+ " is "+f);
    }
}
