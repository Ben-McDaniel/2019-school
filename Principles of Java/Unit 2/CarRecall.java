//Ben McDaniel

import java.util.Scanner;

public class CarRecall{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the car's model number: ");
        int carNum = input.nextInt();

        if (carNum == 119 || carNum == 179 || carNum == 189 || carNum == 190 || carNum == 191 || carNum == 192 || carNum == 193 || carNum == 194 || carNum == 195 || carNum == 221 || carNum == 780){
            System.out.println("Your car is defective. It must be repaired.");
        } else {
            System.out.println("Your car is not defective.");
        }
    }
}