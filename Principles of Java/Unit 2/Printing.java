//Ben McDaniel

import java.util.Scanner;

public class Printing{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int coppies;
        double pricePer, priceTotal;

        System.out.println("How many coppies: ");
        coppies = input.nextInt();

        if (coppies < 0){
            System.out.println("Error");
        } else if (coppies < 100){
            pricePer = 0.3;
            System.out.println("The price per coppy is " + pricePer);
            System.out.println("Your total cost is " + coppies*pricePer);
        } else if (coppies < 500){
            pricePer = 0.28;
            System.out.println("The price per coppy is " + pricePer);
            System.out.println("Your total cost is " + coppies*pricePer);
        } else if (coppies < 750){
            pricePer = 0.27;
            System.out.println("The price per coppy is " + pricePer);
            System.out.println("Your total cost is " + coppies*pricePer);
        } else if (coppies < 1001){
            pricePer = 0.26;
            System.out.println("The price per coppy is " + pricePer);
            System.out.println("Your total cost is " + coppies*pricePer);
        } else{
            pricePer = 0.25;
            System.out.println("The price per coppy is " + pricePer);
            System.out.println("Your total cost is " + coppies*pricePer);q21
        }
    }
}