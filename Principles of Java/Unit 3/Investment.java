//Ben McDaniel

import java.util.*;

public class Investment{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double startAmount, goalAmount, rate;
        int years = 0;
        System.out.print("Enter Starting amount: ");
        startAmount = input.nextInt();
        System.out.println();
        System.out.print("Enter Goal amount: ");
        goalAmount = input.nextInt();
        System.out.println();
        System.out.print("Enter interest rate: ");
        rate = input.nextInt();
        System.out.println();

        rate = rate / 100;

        while (startAmount < goalAmount){
            startAmount = startAmount + startAmount * rate;
            years = years + 1;
        }
        
        System.out.println("It will take " + years + " years");
    }
}