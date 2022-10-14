/* Author : Vinit Patel
    Write a java program that import the user defined package and 
    access the member variable of class that is inside the package
*/

//save by A.java  
package pack;

public class A {
  public void msg() {
    System.out.println("Hello");
  }
}
/*
  To Compile : javac -d . A.java
  To Run     : Not possible as  A.java does not contain "public static void main(String[]args)".
*/


// create new file & save by B.java  
package mypack;

import pack.*;

class B {
  public static void main(String args[]) {
    A obj = new A();
    obj.msg();
  }
}
/*
  To Compile : javac -d . B.java
  To Run : java mypack.B

  NOTE : A.java does not contain "public static void main(String[]args)" .
 */
