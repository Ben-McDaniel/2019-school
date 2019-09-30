//Ben McDaniel

import java.util.Scanner;

public class EvenInt{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int currentnum = 2;

        System.out.println("Enter an Integer");
        int num = input.nextInt();

        if (num < 3){
            System.out.println("Invalid Number Entered");
            System.exit(0);
        }

        while (currentnum < num){
            System.out.println(currentnum);
            currentnum = currentnum + 2;
        }
    }
}