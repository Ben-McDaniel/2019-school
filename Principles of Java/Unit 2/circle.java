//Ben McDaniel

import java.util.Scanner;

public class circle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle Radius");
        double rad = input.nextDouble();

        if (rad < 0.0){
            System.out.println("Invalin");
        }
        else {
            double circ = 2 * 3.14 * rad;
            System.out.println("Circumfrence = " + circ);
        }



    }
}