//Ben McDaniel

import java.util.Scanner;

public class stages{
    public static void main(String[]args){
        Scanner  input = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        }
        else if (age >= 13) {
            System.out.println("Teen");
        }
        else if (age >= 11){
            System.out.println("Preteen");
        }
        else if (age >= 5){
            System.out.println("Child");
        }
        else if (age >= 2) {
            System.out.println("Toddler");
        }
        else if (age >= 0){
            System.out.println("Infant");
        }
        else {
            System.out.println("Not alive");
        }
    }
}