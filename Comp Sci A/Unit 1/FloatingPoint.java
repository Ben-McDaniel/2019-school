//Ben McDaniel

import java.util.Scanner;

public class FloatingPoint{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double one;
        double two;
        double sum;
        double dif;
        double prd;

        System.out.println("Enter number 1: "); 
        one = input.nextDouble(); 
        System.out.println("Enter number 2: ");
        two = input.nextDouble();


        sum = one + two;
        dif = one - two;
        prd = one * two;

        System.out.println("The Sum is: " + sum);
        System.out.println("The Difference is: " + dif);
        System.out.println("The Product is: " + prd);
    }
}