//Ben McDaniel

import java.util.*;

public class RationalTester{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int nume1, nume2, denom1, denom2;
        int opperation;

        System.out.println("Enter the Numerator of your first fraction");
        nume1 = input.nextInt();


        System.out.println("Enter the Denomerator of your first fraction");
        denom1 = input.nextInt();
        
        System.out.println("Enter the Numerator of your second fraction");
        nume2 = input.nextInt();
        
        System.out.println("Enter the Denomerator of your second fraction");
        denom2 = input.nextInt();
        
        System.out.println("====================================================");
        System.out.println("Your fractions are " + nume1 + "/" + denom1 + " and " + nume2 + "/" + denom2);

        Rational frac1 = new Rational(nume1, denom1);
        Rational frac2 = new Rational(nume2, denom2);

        System.out.println("What would you like to do:");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");

        opperation = input.nextInt();
        System.out.println("====================================================");

        if (opperation == 1){
            System.out.println(nume1 + "/" + denom1 + " + " + nume2 + "/" + denom2 + " = " + frac1.add(frac2));
        }else if (opperation == 2){
            System.out.println(nume1 + "/" + denom1 + " - " + nume2 + "/" + denom2 + " = " + frac1.subtract(frac2));
        }else if (opperation == 3){
            System.out.println(nume1 + "/" + denom1 + " * " + nume2 + "/" + denom2 + " = " + frac1.multiply(frac2));
        }else if (opperation == 4){
            System.out.println(nume1 + "/" + denom1 + " / " + nume2 + "/" + denom2 + " = " + frac1.divide(frac2));
        }

    }
}