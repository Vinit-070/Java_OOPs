/*
Author : Vinit Patel. 


 */
import java.util.Scanner;

class Bank {
    private String acc_no;
    private String name;
    private long bal;

    Scanner KB = new Scanner(System.in);

   
    void getdata() {
        System.out.print("Enter Account No: ");
        acc_no = KB.next();
        System.out.print("Enter Name: ");
        name = KB.next();
        System.out.print("Enter Balance: ");
        bal = KB.nextLong();
    }

    //method to display account details
    void displaydata() {
       
        System.out.println("Name of Account Holder : "+name);
        
        System.out.println("Account Number : "+acc_no);
        
        System.out.println("Balance : "+bal);
    }

    //method to deposit money
    void deposit() {
        long amt;
        System.out.println("Enter Amount U Want to Deposit : ");
        amt = KB.nextLong();
        bal = bal + amt;
    }

    //method to withdraw money
    void withdrawal() {
        long amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = KB.nextLong();
        if (bal >= amt) {
            bal = bal - amt;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }

    //method to search an account number
    boolean search(String acn) {
        if (acc_no.equals(acn)) {
            displaydata();
            return (true);
        }
        return (false);
    }
}

public class Bank_system {
    public static void main(String arg[]) {
        Scanner KB = new Scanner(System.in);

        //create initial accounts
        System.out.print("How Many Customer U Want to Input : ");
        int n = KB.nextInt();
        Bank C[] = new Bank[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Bank();
            C[i].getdata();
        }

        //run loop until menu 5 is not pressed
        int ch;
        do {
            System.out.println("1. Display All");
            System.out.println("2. Deposite");
            System.out.println("3. Withdraw");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice :"); 
            ch = KB.nextInt();
           
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].displaydata();
                        }
                        break;

                    case 2:
                        System.out.print("Enter Account No. U Want to Search : ");
                        String acn = KB.next();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Account Not Exist..");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Account No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Account Not Exist..");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Account No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Account Not Exist..");
                        }
                        break;

                    case 5:
                        System.out.println("Bye");
                        break;
                }
            }
            while (ch != 5);
        }
    }
