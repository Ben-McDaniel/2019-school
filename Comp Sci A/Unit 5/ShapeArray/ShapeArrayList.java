//Ben McDaniel

import java.util.*;

public class ShapeArrayList{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        int placeHolder = 0;
        boolean loop = true;
        int choice, inX, inY, r, l, w;

        while (loop){
            System.out.println("1: add circle");
            System.out.println("2: add rectangle");
            System.out.println("3: add square");
            System.out.println("4: display array");
            System.out.println("5: quit");

            choice = input.nextInt();

            if (choice == 1 && placeHolder != 10){
                System.out.println("Enter x coordinate: ");
                inX = input.nextInt();
                System.out.println("Enter Y coordinate: ");
                inY = input.nextInt();
                System.out.println("Enter radius: ");
                r = input.nextInt();
                shapes.add(e) = new Circle(inX, inY, r);
                placeHolder++;
            } else if (choice == 2 && placeHolder != 10){
                System.out.println("Enter x coordinate: ");
                inX = input.nextInt();
                System.out.println("Enter Y coordinate: ");
                inY = input.nextInt();
                System.out.println("Enter length: ");
                l = input.nextInt();
                System.out.println("Enter width: ");
                w = input.nextInt();
                shapes[placeHolder] = new Rectangle(inX, inY, l, w);
                placeHolder++;
            } else if (choice == 3 && placeHolder != 10){
                System.out.println("Enter x coordinate: ");
                inX = input.nextInt();
                System.out.println("Enter Y coordinate: ");
                inY = input.nextInt();
                System.out.println("Enter length: ");
                l = input.nextInt();
                shapes[placeHolder] = new Square(inX, inY, l);
                placeHolder++;
            } else if (choice == 4){    
                System.out.println(Arrays.toString(shapes));
            } else if (choice == 5){
                loop = false;
            }
        }
    }

   
}