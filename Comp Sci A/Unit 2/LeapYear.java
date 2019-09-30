//Ben McDaniel

import java.util.Scanner;

public class LeapYear{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Year after 1582:");
        int year = input.nextInt();
        
        if (year < 1583){
            System.out.println("Sorry your Year cant be before 1582");
            System.exit(0);
        }
        else if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println("This year is a leap year");
                System.exit(0);
            }
            else{
                System.out.println("This year is not a leap year");
                System.exit(0);
            } 
        }
        else if (year % 4 != 0){
            System.out.println("This year is not a leap year");
            System.exit(0);
        }
        else{
            System.out.println("This year is a leap year");
            System.exit(0);
        }
        
    }
} 