/*
Author : Vinit Patel.
Write a program to print inputs given from command line  arguments on the console
*/ 
class input{
    public static void main(String[]args){
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }
}