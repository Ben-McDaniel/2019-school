//Ben McDaniel

//Write a program that inputs the X location, Y location, length and width of a rectangle on an X,Y coordinate plane. 
//The program then instantiates a new Rectangle object using the available Rectangle class (and other associated classes) provided by the teacher, and uses the data input from the user to populate the Rectangle object data.

//After creating a Rectangle object, complete the following steps using ONLY the available Rectangle class methods. DO NOT PERFORM ANY MATHEMATICAL OPERATIONS ON ANY DATA IN THIS PROGRAM!

//1. Instantiate (create) a Rectangle object using data from user input
//2. Display the rectangle's area including an appropriate message (i.e. Area = 12.58)
//3. Display the rectangle's perimeter including an appropriate message
//4. Display the rectangle's current location (X, Y) using ONLY the rectangle object methods
//5. Move the rectangle to a different location on the coordinate plane by using an appropriate method

//Beneath that section of program code, do ALL of the same things with a Circle object (X location, Y location and radius) as instructed above.


import java.util.Scanner;

public class Rectangle{

    public int x;
    public int y;
    public int height;
    public int width;
    public Rectangle(int xx, int yy, int heightt, int widthh){
        x = xx;
        y = yy;
        height = heightt;
        width = widthh;

    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x Location:");
        int userx = input.nextInt();
        System.out.println("Enter y Location:");
        int usery = input.nextInt();
        System.out.println("Enter Height:");
        int userheight = input.nextInt();
        System.out.println("Enter Width:");
        int userwidth = input.nextInt();
    }
}

