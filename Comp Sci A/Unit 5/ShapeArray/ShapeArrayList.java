//Ben McDaniel

import java.util.*;

public class ShapeArrayList{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        boolean loop = true;
        int choice, inX, inY, r, l, w;

        while (loop){
            System.out.println("1: add circle");
            System.out.println("2: add rectangle");
            System.out.println("3: add square");
            System.out.println("4: display array");
            System.out.println("5: quit");

            choice = input.nextInt();

            if (choice == 1){
                System.out.println("Enter x coordinate: ");
                inX = input.nextInt();
                System.out.println("Enter Y coordinate: ");
                inY = input.nextInt();
                System.out.println("Enter radius: ");
                r = input.nextInt();
                shapes.add(new Circle(inX, inY, r));
            } else if (choice == 2){
                System.out.println("Enter x coordinate: ");
                inX = input.nextInt();
                System.out.println("Enter Y coordinate: ");
                inY = input.nextInt();
                System.out.println("Enter length: ");
                l = input.nextInt();
                System.out.println("Enter width: ");
                w = input.nextInt();
                shapes.add(new Rectangle(inX, inY, l, w));
            } else if (choice == 3){
                System.out.println("Enter x coordinate: ");
                inX = input.nextInt();
                System.out.println("Enter Y coordinate: ");
                inY = input.nextInt();
                System.out.println("Enter length: ");
                l = input.nextInt();
                shapes.add(new Square(inX, inY, l));
            } else if (choice == 4){    
                System.out.println(shapes);
            } else if (choice == 5){
                loop = false;
            }
        }
    }

   
}