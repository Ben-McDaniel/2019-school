//Ben McDaniel

import java.util.*;

public class DigitsSum{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String num;
        int junk, total = 0;

        System.out.print("Enter an Integer: ");
        num = input.nextLine();

        for (int i = 0; i < num.length(); i++){
            junk = num.charAt(i);
            total += junk;
        }
        System.out.println(total);
    }
}