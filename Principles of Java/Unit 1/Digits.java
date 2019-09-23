//Ben McDaniel

import java.util.Scanner;

public class Digits{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int hundreds;
        int number;
        int ones;
        int tens;


        //takes in numbers and splits the ones and tens
        System.out.println("Enter a 3-digit number>");
        number = input.nextInt();
        hundreds = number / 100;
        tens = number % 100;
        ones = tens % 10;
        tens = tens / 10;
        


        //prints the numbers 
        System.out.println("Hundreds: " + hundreds + ", Tens: " + tens + ", Ones: " + ones);


    }
}