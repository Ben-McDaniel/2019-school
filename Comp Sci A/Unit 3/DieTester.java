//Ben McDaniel 

import java.util.Scanner;
public class DieTester{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Die d1 = new Die();
        int sides = 1;
            while (sides != 0){
                System.out.println("How many Sides (Enter 0 to quit):");
                sides = input.nextInt();
                d1.roll(sides);
                System.out.println("Dice: " + d1.getFaceValue());
            }
            System.exit(0);
        }
}