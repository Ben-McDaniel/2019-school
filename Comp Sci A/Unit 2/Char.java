//Ben McDaniel

import java.util.Scanner;

public class Char{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int strLength;
        String strg;
        char x;
        System.out.println("Enter a String");
        strg = input.nextLine();

        strLength = strg.length();
       
        while (counter < strLength){
            x = strg.charAt(counter);
            System.out.println(x);
            counter++;
        }
    }
}