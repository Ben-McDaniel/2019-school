//Ben McDaniel

import java.util.Scanner;

public class PackageCheck{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int length, width, height, weight;

        System.out.println("Enter Package Length: ");
        length = input.nextInt();
        System.out.println("Enter Package Width: ");
        width = input.nextInt();
        System.out.println("Enter Package Height: ");
        height = input.nextInt();
        System.out.println("Enter Package Weight: ");
        weight = input.nextInt();

        if (length > 10 || width > 10 || height > 10){    
            if (weight > 10){
                System.out.println("Package too Heavy and to Big");
            } else{
                System.out.println("Package too Big");
            }
        } else if (weight > 10){
            System.out.println("Package too Heavy");
        } else {
            System.out.println("Package Accepted");
        }
    }
}