//Ben McDaniel

import java.util.Scanner;

public class AverageCalculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in); 
        double value, sum, average, count;
        value = 2;
        sum = 0;
        count = 0;


            while (value != 0 && count != 3) {
                System.out.println("Enter a Number (0 to quit): "); 
                value = input.nextDouble(); 
                sum += value;
                count++;
            }

        if (value == 0){
            System.exit(0);
        }
        else{
            average = (sum)/3;
            System.out.println("The Average is: " + average);
        }
        

    }
}