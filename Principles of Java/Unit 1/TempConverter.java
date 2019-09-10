//Ben McDaniel

import java.util.Scanner;

public class TempConverter{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double far; 
        double cel;

        System.out.println("Enter a Fahrenheit temp: ");
        far = input.nextDouble();

        cel = ((far-32)* 5)/9;
        
        System.out.println(far + " Degrees f is " + cel + "Degrees C.");
    }
}