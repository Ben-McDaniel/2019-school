//Ben McDaniel

import java.util.Scanner;

public class num{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int numLength;
        int count = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Enter A number:");
        int userNum = input.nextInt();
        numLength = String.valueOf(userNum).length();

        while (count < numLength){
            int check = String.valueOf(userNum).charAt(count);
            
            if ((check % 2) == 0){
                even++;
            }
            else{
                odd++;
            }

            count++;
        }

        System.out.println("There are " + even + " even numbers, and " + odd + " odd numbers");

    }
}