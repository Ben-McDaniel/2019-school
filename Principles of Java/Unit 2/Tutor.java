//Ben McDaniel

import java.util.Scanner;
import java.util.Random;

public class Tutor{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        double num1 = (double)rand.nextInt(10);
        double num2 = (double)rand.nextInt(10);
        int symbol = rand.nextInt(4);
        double correct = 0;
        double guess;

        System.out.println("Enter The Correct Answer");

        if (symbol == 0){
            System.out.println(num1 + "+" + num2);
            correct = num1 + num2;
        }else if (symbol == 1){
            System.out.println(num1 + "-" + num2);
            correct = num1 - num2;
        }else if (symbol == 2){
            System.out.println(num1 + "*" + num2);
            correct = num1 * num2;
        }else if (symbol == 3){
            System.out.println(num1 + "/" + num2);
            correct = num1 / num2;
        }

        System.out.println("Enter Guess: ");
        guess = input.nextDouble();

        if (guess == correct){
            System.out.println("Correct Answer!");
        }else{
            System.out.println("FAILURE!");
        }
    }
}