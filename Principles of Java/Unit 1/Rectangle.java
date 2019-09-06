//Ben McDaniel  

import java.util.Scanner;

public class Rectangle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double len;
        double wid;
        double per;

        System.out.println("Enter the length: ");
        len = input.nextDouble();
        System.out.println("Enter the width: ");
        wid = input.nextDouble();

        per = (2*len) + (2*wid);

        System.out.println("The perimiter is: " + per);
    }
}