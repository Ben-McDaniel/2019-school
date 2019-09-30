//Ben McDaniel

import java.util.Scanner;

public class Spending{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Double food, clothing, entertainment, rent, total, pfood, pclothing, prent, pentertainment;

        System.out.println("Food: ");
        food = input.nextDouble();
        System.out.println("Clothing: ");
        clothing = input.nextDouble();
        System.out.println("Entertainment: ");
        entertainment = input.nextDouble();
        System.out.println("Rent: ");
        rent = input.nextDouble();

        total = food + clothing + entertainment + rent;

        
        pfood = food / total * 100;
        pclothing = clothing / total * 100;
        pentertainment = entertainment / total * 100;
        prent = rent / total * 100;

         System.out.println("Category                  Budget");
         System.out.println("Food                  " + pfood + "%");
         System.out.println("Clothing              " + pclothing + "%");
         System.out.println("Entertainment         " + pentertainment + "%");
         System.out.println("Rent                  " + prent + "%");
    }
}