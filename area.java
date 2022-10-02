/*
Author : Vinit Patel.
    Write a Java class ShapeArea which calculates the area of a Square, Rectangle and Circle.
    Write a program to print the area of square, rectangle and circle.
  Demonstrate the concept of method overloading
*/ 
import java.util.*;
class ShapeArea
{    
    Scanner sc = new Scanner(System.in);
    double area(double r)
    {
       
        return(3.14*r*r);
    }
    int area(int l, int b)
    {
       
        return(l*b);
    }
    int area(int a)
    {
        
        return(a*a);
    }
}
 public class area
{
    public static void main(String[] args) 
    {
        ShapeArea s = new ShapeArea();
        System.out.println("Area of Circle : "+s.area(2.0));
        System.out.println("Area of Rectangle : "+s.area(2, 4));
        System.out.println("Area of Square : "+s.area(4));
    }
}