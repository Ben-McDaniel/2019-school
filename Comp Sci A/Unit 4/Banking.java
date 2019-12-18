//Ben McDaniel

import java.util.Scanner;

public class Banking{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
        Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
        Account acct3 = new Account ("Sanchit Reddy", 793757, 759.32);

        acct1.deposit (25.85);

        double gomezBalance = acct2.deposit (500.00);
        System.out.println("Gomez balance after deposit: " + gomezBalance);
        System.out.println("Gomez balance after withdraw: " + acct2.withdraw(430.75, 1.50));

        acct3.withdraw(800.00, 0.0);

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);


        System.out.println();
        System.out.println("Transfering $10 from account 1 to account 2: ");
        acct1.transferTo(acct2, 10);
        System.out.println(acct1);
        System.out.println(acct2);

        System.out.println();
        System.out.println("Open an account");
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Enter 5-Digit Account Number: ");
        int userAcctNum = input.nextInt();

        Account acct4 = new Account (name, userAcctNum, 0.0);
        System.out.println("Your New Account Info:");
        System.out.println(acct4);

    }
}