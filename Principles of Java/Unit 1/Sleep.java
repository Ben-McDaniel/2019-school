//Ben McDaniel

import java.util.Scanner;


public class Sleep{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int pYear, pMonth, pDay, cYear, cMonth, cDay, tYear, tMonth, tDay, hours, pDays, cDays;

        System.out.println("Enter your Birthday");
        System.out.println("Year: ");
        pYear = input.nextInt();
        System.out.println("Month: ");
        pMonth = input.nextInt();
        System.out.println("Day: ");
        pDay = input.nextInt();

        System.out.println("Enter Today's Date");
        System.out.println("Year: ");
        cYear = input.nextInt();
        System.out.println("Month: ");
        cMonth = input.nextInt();
        System.out.println("Day: ");
        cDay = input.nextInt();



        pDays = pYear * 365 + pMonth * 30 + pDay;
        cDays = cYear * 365 + cMonth * 30 + cDay;
        tDay = cDays - pDays;
        hours = tDay * 8;

        System.out.println("You have been alive for " + tDay + " days.");
        System.out.println("You have been asleep for " + hours + " hours.");

    }
}