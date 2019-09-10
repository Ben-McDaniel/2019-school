//Ben McDaniel

import java.util.Scanner;

public class Digits{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number;
        int ones;
        int tens;


        //takes in numbers and splits the ones and tens
        System.out.println("Enter a 2-digit number>");
        number = input.nextInt();
        tens = number / 10;
        ones = number % 10;


        //prints the numbers 
        System.out.println("Tens: " + tens + ", Ones: " + ones);


    }
}