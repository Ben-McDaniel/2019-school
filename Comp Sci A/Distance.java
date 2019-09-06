//Ben McDaniel

import java.util.Scanner;

public class Distance{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        double x1;
        double x2;
        double y1;
        double y2;
        double res;



        String[] coord1 = input.nextLine();
        String delims = "[,]";
        String[] tokens = coord1.split(delims);


        for (int i = 0; i < coord1.length; i++) 
        System.out.println("Element at index " + i +  " : "+ coord1[i]);
    }
}