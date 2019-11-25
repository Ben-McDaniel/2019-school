//Ben McDaniel

import java.util.Scanner;
import java.lang.Math;

public class HiLo{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int cpuNum, playerNum;

        cpuNum = (int)((1001-1 + 1) * Math.random() + 1);

        System.out.println("Enter a Number: ");
        playerNum = input.nextInt();

        while (cpuNum != playerNum){
            if (playerNum < cpuNum){
                System.out.println("Your Number was to low");
            } else {
                System.out.println("Your Number was to high");
            }

            System.out.println("Enter a New Number: ");
            playerNum = input.nextInt();
            counter++;
        }

        System.out.println("You correctly Guessed the Number " + cpuNum + " in " + counter + " Attempts");
    }
}