//Ben McDaniel

import java.util.*;
import java.lang.*;


public class Pig{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        PairOfDice cpu = new PairOfDice();
        PairOfDice player = new PairOfDice();
        int cpuCount = 0;
        int playerCount = 0;
        int choice = 1;
        int pointsEarned = 0;
        int tempTotal;

        int[] ret = cpu.roll();
        int temp1;
        int temp2;
  


//game loop
        while (cpuCount < 100 && playerCount < 100){
            if (choice != 0){
                //player loop
                ret = player.roll();

                if (ret[0] == 1 && ret[1] == 1){
                    playerCount = 0;
                    System.out.println("TWO ZEROS! You loose all points");
                    System.out.println("Your new total is " + playerCount);
                    choice = 0;
                } else if (ret[0] == 1 || ret[1] == 1){
                    System.out.println("Aww you rolled a Zero, now its Computers Turn");
                    playerCount -= pointsEarned;
                    System.out.println("Your new total is " + playerCount);
                    choice = 0;
                }else {
                    temp1 = ret[0];
                    temp2 = ret[1];
                    tempTotal = temp1 + temp2;
                    playerCount += temp1 + temp2;
                    pointsEarned += tempTotal;
                    System.out.println("You rolled " + tempTotal + " points");
                    System.out.println("Your new total is " + playerCount);
                    System.out.println("Would you like to roll again (1 for yes 0 for no)");
                    choice = input.nextInt();
                }
            } else{
                //cpu loop
                pointsEarned = 0;
                while (pointsEarned < 20 && cpuCount < 100){
                    ret = cpu.roll();
                if (ret[0] == 1 && ret[1] == 1){
                    cpuCount = 0;
                    System.out.println("TWO ZEROS! Computer looses all points");
                    System.out.println("Computers new total is " + cpuCount);
                    choice = 0;
                } else if (ret[0] == 1 || ret[1] == 1){
                    System.out.println("Computer you rolled a Zero, now its Your Turn");
                    cpuCount -= pointsEarned;
                    System.out.println("Computers new total is " + cpuCount);
                    choice = 0;
                }else{
                    temp1= ret[0];
                    temp2 = ret[1];
                    tempTotal = temp1 + temp2;
                    pointsEarned += tempTotal;
                    cpuCount += temp1 + temp2;
                    System.out.println("CPU rolled " + tempTotal + " points");
                    System.out.println(cpuCount);
                }
                System.out.println("Your Turn To Roll");
                choice = 1;
                pointsEarned = 0;
                }
            }
        }
    

        

    
        //print winner
        if (cpuCount >= 100){
            System.out.println("COMPUTER WINS");
        } else{
            System.out.println("PLAYER WINS");
        }
    }
}

    

