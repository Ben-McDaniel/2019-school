//Ben McDaniel

import java.util.Scanner;
import java.util.Random;

public class Guessing{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Boolean correct = false;
        int secret, guess = 0;
        int numGuesses = 0;
        secret = rand.nextInt(25) + 1;

        while (numGuesses < 3 && guess != secret){
            System.out.println("Enter Guess: ");
            guess = input.nextInt();
            if (guess < secret){
                System.out.println("Too Low");
            } else if (guess > secret){
                System.out.println("Too High");
            }
        }

        if (guess != secret){
            System.out.println("What a Shame, the correct answer was: " + secret);
        } else {
            System.out.println("Congrats, you did it!");
        }

    }
}