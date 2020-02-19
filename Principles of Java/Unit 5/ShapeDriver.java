//Ben McDaniel

import java.util.*;

public class ShapeDriver{
    public static void main(String[]args){
        int rL, rW, rX, rY, cX, cY, choice;
        double cR;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Length of Rectangle:");
        rL = input.nextInt();
        System.out.println("Enter Width of Rectangle");
        rW = input.nextInt();
        System.out.println("Enter X coord");
        rX = input.nextInt();
        System.out.println("Enter Y coord");
        rY = input.nextInt();
        Rectangle rect = new Rectangle(rX, rY, rL, rW);

        System.out.println("Enter radius of Circle");
        cR = input.nextDouble();
        System.out.println("Enter X coord");
        cX = input.nextInt();
        System.out.println("Enter Y coord");
        cY = input.nextInt();
        Circle circ = new Circle(cX, cY, cR);
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        do{
            System.out.println("Enter your choice: ");
            System.out.println("1) Display Circles Circumference");
            System.out.println("2) Display Circles Area");
            System.out.println("3) Display Circles Location");
            System.out.println("4) Move Circle");
            System.out.println("5) Display Rectangles Perimeter");
            System.out.println("6) Display Rectangles Area");
            System.out.println("7) Display Rectangles Location");
            System.out.println("8) Move Rectangle");
            System.out.println("9) Quit");
            System.out.println("=========================================");
            choice = input.nextInt();

            if (choice == 1){
                System.out.println(circ.getCircumference());
            } else if( choice == 2){
                System.out.println(circ.getArea());
            } else if (choice == 3){
                System.out.println(circ.getLocation());
            } else if (choice == 4){
                System.out.println("Current location: " + circ.getLocation());
                System.out.println("Enter new x and y coords");
                cX = input.nextInt();
                cY = input.nextInt();
                circ.move(cX, cY);
            } else if (choice == 5){
                System.out.println(rect.getPerimeter());
            } else if (choice == 6){
                System.out.println(rect.getArea());
            } else if (choice == 7){
                System.out.println(rect.getLocation());
            } else if (choice == 8){
                System.out.println("Current location: " + rect.getLocation());
                System.out.println("Enter new x and y coords");
                rX = input.nextInt();
                rY = input.nextInt();
                rect.move(rX, rY);
            }
        }while(choice != 9);
    }
}