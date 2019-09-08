//Ben McDaniel

import java.util.Scanner;

public class AverageCalculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in); 
        double one; 
        double two;
        double three;
        double average;

        System.out.println("Enter number 1: "); 
        one = input.nextDouble(); 
        System.out.println("Enter number 2: "); 
        two = input.nextDouble(); 
        System.out.println("Enter number 3: "); 
        three = input.nextDouble(); 

        average = (one + two + three)/3;

        System.out.println("The Average is: " + average);

    }
}