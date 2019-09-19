//Ben McDaniel

import java.util.Scanner;

public class Change{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int change;
        int quarters;
        int dimes;
        int nickels;
        int pennies;

        System.out.println("Enter the amout of change: ");
        change = input.nextInt();

        quarters = change / 25;
        change = change % 25;
        dimes = change / 10;
        change = change %10;
        nickels = change / 5;
        change = change % 5;
        pennies = change / 1;
        
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);




    }
}