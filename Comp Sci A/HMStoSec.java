//Ben McDaniel

import java.util.Scanner;

public class HMStoSec{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double hour;
        double min;
        double sec;

        System.out.println("Enter the number of hours: "); 
        hour = input.nextDouble(); 
        System.out.println("Enter the number of minutes: "); 
        min = input.nextDouble(); 
        System.out.println("Enter the number of seconds: "); 
        sec = input.nextDouble(); 

        min = min + (hour*60);

        sec = sec + (min*60);

        System.out.println("The total is " + sec + " seconds");
    }
}