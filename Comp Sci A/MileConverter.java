//Ben McDaniel

import java.util.Scanner;

public class MileConverter{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double mile;
        double kilm;

        System.out.println("Enter your distance: ");
        mile = input.nextDouble();

        kilm = mile * 1.60935;

        System.out.println("The distance is " + kilm + "km");
    }   
}