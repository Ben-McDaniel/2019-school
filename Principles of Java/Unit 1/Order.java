//Ben McDaniel

import java.util.Scanner;

public class Order{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int burgers, fries, soda;
        Double grossTotal, tax, finalTotal, tendered, change;
        
        System.out.println("Number of Burgers: ");
        burgers = input.nextInt();
        System.out.println("Number of Fries: ");
        fries = input.nextInt();
        System.out.println("Number of Sodas: ");
        soda = input.nextInt();
    
        grossTotal = burgers * 1.69 + fries * 1.09 + soda * 0.99;
        tax = grossTotal * .065;
        finalTotal = grossTotal + tax;

        System.out.println("Total before Tax: " + grossTotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total with Tax: " + finalTotal);

        System.out.println("Enter the amount tendered: ");
        tendered = input.nextDouble();
        change = tendered - finalTotal;
        System.out.println("Change: " + change);
    }

}