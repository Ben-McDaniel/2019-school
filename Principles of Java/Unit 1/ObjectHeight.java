//Ben McDaniel

import java.util.Scanner;

public class ObjectHeight{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double time;
    double height;
    System.out.println("Enter a Time less than 4.5 seconds");
    System.out.print(">");
    time = input.nextDouble();
    height = 100-4.9 * (time * time);
    System.out.println("The height of the object is " + height + " meters");
  }
}
