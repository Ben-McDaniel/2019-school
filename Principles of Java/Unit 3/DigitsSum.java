//Ben McDaniel

import java.util.*;
import java.math.*;
import java.lang.*;

public class DigitsSum{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String junk, num;
        int total = 0;

        System.out.print("Enter an Integer: ");
        num = input.nextLine();

        for (int i = 0; i < num.length(); i++){
            junk = num.substring(i, i+1);
            int v = Integer.parseInt(junk);
            total = total + v;
        }
        System.out.println(total);
    }

}