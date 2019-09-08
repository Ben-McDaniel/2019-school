//Ben McDaniel

import java.util.Scanner;
import java.lang.Math;

public class Distance{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        double distance;

        //gets first set of coords

        System.out.println("Enter the first set of coordinates 'x,y' ");
        System.out.print(">");
        String str1 = input.nextLine();

        String[] coords1 = str1.split(",");
        String x1 = coords1[0];
        String y1 = coords1[1];
        System.out.println(x1);
        System.out.println(y1);

        //gets second set of coords

        System.out.println("Enter the second set of coordinates 'x,y' ");
        System.out.print(">");
        String str2 = input.nextLine();

        String[] coords2 = str2.split(",");
        String x2 = coords2[0];
        String y2 = coords2[1];
        System.out.println(x2);
        System.out.println(y2);

        //converts the strings to doubles

        double coordx1 = Double.valueOf(x1);
        double coordy1 = Double.valueOf(y1);
        double coordx2 = Double.valueOf(x2);
        double coordy2 = Double.valueOf(y2);

        //does the calculation

        distance = Math.sqrt(((coordy2 - coordy1) * (coordy2 - coordy1)) + ((coordx2 - coordx1) * (coordx2 - coordx1)));
     
        System.out.println(distance);
    }
}