/*  
    Author : Vinit Patel.
    Write a program using switch Case which takes two Command-Line Arguments :
 - The First argument is a string (odd, even, avg, sum) which specifies the operation.
 - The Second argument (number N) is the upper limit of the range starting from 0.
 - Ex :- Arguments : even 10; Output : 0 2 4 6 8 10
         Arguments : sum 5; Output : 15
*/ 

import java.util.*;
import java.lang.*;
public class odd_even
{
    public static void main(String[] args)
    {
        int s=0, c;
        int n = Integer.parseInt(args[1]);
        switch (args[0])
        {
            case "odd" :
            c = 1;
            while(c<n)
            {
                if(c % 2 == 1)
                {
                    System.out.println(c + " ");
                }
                c++;
            }
            break;
            case "even" :
            c = 1;
            while(c<n)
            {
                if(c % 2 == 0)
                {
                    System.out.println(c + " ");
                }
                c++;
            }
            break;
            case "sum" :
            while (n>0)
            {
                s = s + n;
                n--;
            }
            System.out.println("Sum is "+s);
            break;

            default :
            System.out.println("Wrong Input !");
        }
    }
}