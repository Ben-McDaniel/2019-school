//Ben McDaniel

import java.util.Scanner;

public class SimpleInt{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        Double principal, years, intrestRate, finalTotal;

        System.out.println("Enter Starting Amount: ");
        principal = input.nextDouble();
        System.out.println("Enter Number of Years: ");
        years = input.nextDouble();
        System.out.println("Enter Interest Rate: ");
        intrestRate = input.nextDouble();

        finalTotal = principal * (1 + years * intrestRate);

        System.out.println("The value after " + years + " years is : " + finalTotal);


    }
}