//Ben McDaniel

import java.util.Scanner;

public class Distance{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double seg1;
        double seg2;
        double seg3;
        double total;

        System.out.println("Enter the length 1: ");
        seg1 = input.nextDouble();
        System.out.println("Enter the length 2: ");
        seg2 = input.nextDouble();
        System.out.println("Enter the length 3: ");
        seg3 = input.nextDouble();

        total = seg1 + seg2 + seg3;

        System.out.println("The race is " + total + "km long");
    }

}