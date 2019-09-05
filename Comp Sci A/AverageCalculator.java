//Ben McDaniel

import java.util.Scanner;

public class AverageCalculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in); 
        int one; 
        int two;
        int three;
        int average;

        System.out.println("Enter number 1: "); 
        one = input.nextInt(); 
        System.out.println("Enter number 2: "); 
        two = input.nextInt(); 
        System.out.println("Enter number 3: "); 
        three = input.nextInt(); 

        average = (one + two + three)/3;

        System.out.println("The Average is: " + average);

    }
}