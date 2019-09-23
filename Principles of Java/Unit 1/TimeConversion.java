//Ben McDaniel

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class TimeConversion{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a time in minutes: ");
        int user_min = input.nextInt();
        int hours;
        int minutes;

        hours = user_min / 60;
        minutes = user_min % 60;

            System.out.println(hours + ":" + minutes);


    }
}



