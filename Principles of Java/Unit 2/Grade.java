//Ben McDaniel

import java.util.Scanner;

public class Grade{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Percentage: ");
        double grade = input.nextDouble();

        if (grade > 89.5){
            System.out.println("A");
        }else if (grade > 79.5){
            System.out.println("B");
        }else if (grade > 69.5){
            System.out.println("C");
        }else if (grade > 59.5){
            System.out.println("D");
        }else{
            System.out.println("YOU FAILED!");
        }
    }
}