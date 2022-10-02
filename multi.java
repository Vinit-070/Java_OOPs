/*  
    Author : Vinit Patel.
   - Create a class Product that has data members Product ID, Product Name and Price. 
   - Create class ProductDetails by inheriting Product class and having a method to enter all 
        product details. 
   - Create class DisplayDetails by inheriting ProductDetails class and having a method to display
        all the details of the product. 
   - Write a program to print details of two products using Multi-Level inheritance.
*/ 
import java.util.*;
class Product
{
    int p_id, p_price;
    String p_name;
}
class ProductDetails extends Product
{
    Scanner sc = new Scanner(System.in);
    void getdata()
    {
        System.out.print("Enter Product Name : ");
        p_name = sc.nextLine();
        System.out.print("Enter Product ID : ");
        p_id = sc.nextInt();
        System.out.print("Enter Product Price : ");
        p_price = sc.nextInt();
    }
}
class DisplayDetails extends ProductDetails
{
    void display()
    {
        System.out.println("Product Name : "+p_name);
        System.out.println("Product ID : "+p_id);
        System.out.println("Product Price : "+p_price);
    }
}
public class multi
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter number of products whose details you want to enter : ");   
        n = s.nextInt();
        DisplayDetails p[] = new DisplayDetails[n];
        for(int i=0; i<n; i++)
        {
            p[i] = new DisplayDetails();
            p[i].getdata();
        }
        for(int i=0; i<n; i++)
        {
            p[i].display();
        }

    }
}