//Ben McDaniel

import java.util.Scanner;

public class PizzaCost{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double d;
    double cost;
    double mat;

    System.out.println("Enter the diameter of the pizza in inches:");
    d = input.nextDouble();
    mat = d * d * 0.05;
    cost = mat + 1.0 + 0.75;
    System.out.println("The cost of making the pizza is $" + cost);
  }
}
