//Mr. Mosier's Introduction to OO Programming
//Use this class to get started on the Part A Unit 1
import java.util.Scanner;
public class ProgrammingProjectPartA {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        //1. INPUT data for rectangle
        //NOTE: THE FOLLOWING CODE DOES NOT INPUT ANYTHING!
        //YOU MUST TURN THESE 4 LINES INTO INPUT (8 LINES OF CODE)
        System.out.println("Enter the X location: ");
        int x = input.nextInt();
        System.out.println("Enter the Y Location: ");
        int y = input.nextInt();
        System.out.println("Enter the Length: ");
        int length = input.nextInt();
        System.out.println("Enter the Width: ");
        int width = input.nextInt();
        
        //2. Instantiate a Rectangle object using input data
        Rectangle rect1 = new Rectangle(x,y,length,width);
        System.out.println("Rectangle Area = " + rect1.getArea());
        System.out.println("Rectangle Perimeter = " + rect1.getPerimeter());
        System.out.println("Rectangle Location = " + rect1.getPosition());
        rect1.moveTo(10,10);
        System.out.println("Rectangle Location = " + rect1.getPosition());
        //NOTE: You have to look at the Rectangle class to find out
        //how to construct a Rectangle object

        //After you instantiate a new Rectangle/Circle object,
        //use the Shape Interface to determine which methods to use
        //to complete each task (i.e. getArea()). You can also get this
        //information from the classes themselves
        
        //After completing the requirements for the Rectangle part,
        //do the same things for the Circle part(input, output, etc.)
        
        
    }
}
