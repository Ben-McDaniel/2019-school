//Ben McDaniel

import java.util.Scanner;




public class Energy{
    public static void main(String[]args){


        if (20 > 18) 
            System.out.println("20 is greater than 18"); // obviously

        Scanner input = new Scanner(System.in);
        double mass;
        double Energy;
        double speed_of_light = 3 * 10* 10* 10* 10* 10* 10* 10* 10 ;
        double bulbs;

        System.out.println("Enter the mass in kg: ");
        mass = input.nextInt();

        Energy = mass * (speed_of_light * speed_of_light);

        bulbs = Energy / 360000;

        System.out.println("The energy produced in Joules is: " + Energy);

        System.out.println("The number of 100-watt light bulbs powered is: " + bulbs);




    }
}


