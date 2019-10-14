//Ben McDaniel

import java.util.Scanner;

public class egg{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int numEggs, dozEgg, modEgg;
        double cost;
        System.out.println("Enter the Number of Eggs:");
        numEggs = input.nextInt();

        dozEgg = numEggs / 12;
        modEgg = numEggs % 12;

        if (dozEgg < 4){
            cost = dozEgg * 0.5 + modEgg * (0.5/12);
            System.out.println("Your total is $" + cost);
        } else if (dozEgg < 6){
            cost = dozEgg * 0.45 + modEgg * (0.45/12);
            System.out.println("Your total is $" + cost);
        } else if (dozEgg < 11){
            cost = dozEgg * 0.4 + modEgg * (0.4/12);
            System.out.println("Your total is $" + cost);
        } else{
            cost = dozEgg * 0.35 + modEgg * (0.35/12);
            System.out.println("Your total is $" + cost);
        }

    }
}