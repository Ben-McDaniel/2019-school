//Ben McDaniel

import java.util.Scanner;

public class Char{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int counter = 0, strLength = 0;
        String strg;
        char x;
        System.out.println("Enter a String");
        strg = input.nextLine();

        strLength = strg.length();
        System.out.println(strLength);
       
        while (counter <= strLength){
            x = strg.charAt(counter);
            counter++;
        }
    }
}