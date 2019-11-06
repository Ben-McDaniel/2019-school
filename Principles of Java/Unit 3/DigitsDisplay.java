//Ben McDaniel

import java.util.*;

public class DigitsDisplay{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String num;

        System.out.print("Enter an Integer: ");
        num = input.next();

        for (int i = 0; i < num.length(); i++){
            System.out.println(num.charAt(i));
        }
    }
}