//Ben McDaniel

import java.util.Scanner;

public class SectoHMS{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in); 
        int usersec;
        int sec;
        int min;
        int hour;

//use int to get rid of decimal and make conversion easier

        System.out.println("Enter the number of seconds:");
        usersec = input.nextInt();

        sec = (usersec % 60);

        min = (usersec / 60) % 60;

        hour = (usersec /60) / 60;

        System.out.println("The time converts to: ");
        System.out.println(hour + ":" + min + ":" + sec);
    }
}