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
        int whatever;
        int[] ret = cpu.roll();
        int temp1;
        int temp2;
        int cpuCheck = 0;
  


//game loop
        while (cpuCount < 100 && playerCount < 100){
            if (choice != 0){
                //player loop
                ret = player.roll();

                if (ret[0] == 1 && ret[1] == 1){
                    playerCount = 0;
                    System.out.println("TWO Ones! You loose all points");
                    System.out.println("Your new total is " + playerCount);
                    System.out.println("Computer's Turn To Roll (any number to contune)");
                    whatever = input.nextInt();
                    choice = 0;
                } else if (ret[0] == 1 || ret[1] == 1){
                    System.out.println("Aww you rolled a One and lost all points from this turn, now its Computers Turn");
                    playerCount -= pointsEarned;
                    System.out.println("Your new total is " + playerCount);
                    System.out.println("Computer's Turn To Roll (any number to contune)");
                    whatever = input.nextInt();
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
                System.out.println("============================================================================");
                pointsEarned = 0;
                while (pointsEarned < 20 && cpuCount < 100 && cpuCheck != 1){
                    ret = cpu.roll();
                    if (ret[0] == 1 && ret[1] == 1){
                        cpuCount = 0;
                        System.out.println("TWO Ones! Computer looses all points");
                        System.out.println("Computers new total is " + cpuCount);
                        cpuCheck = 1;
                    } else if (ret[0] == 1 || ret[1] == 1){
                        System.out.println("Computer rolled a One and looses all points from this turn, now its Your Turn");
                        cpuCount -= pointsEarned;
                        System.out.println("Computers new total is " + cpuCount);
                        cpuCheck = 1;
                    }else{
                        temp1= ret[0];
                        temp2 = ret[1];
                        tempTotal = temp1 + temp2;
                        pointsEarned += tempTotal;
                        cpuCount += temp1 + temp2;
                        System.out.println("CPU rolled " + tempTotal + " points");
                        System.out.println("Computers new total is " + cpuCount);
                    }
                }
                System.out.println("============================================================================");
                System.out.println("Computer passes to you. Your Turn To Roll (any number to contune)");
                whatever = input.nextInt();
                choice = 1;
                pointsEarned = 0;
                cpuCheck = 0;

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

    

