//Ben McDaniel

import java.util.Scanner;
import java.lang.Math;

public class U1FPB{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //imputs the 4 digit number 
        int UserNum = input.nextInt();

        //checks to make sure the number is 4 digits
        if ((UserNum > 999) && (UserNum < 10000)){
            System.out.println(UserNum);
        } else{
            System.out.println("Failed: Number was not 4 digits long");
        }


        //assign the varible to a string
        String str = String.valueOf(UserNum);
        String[] Num = str.split();
        String num1 = Num[0];
        String num2 = Num[1];
        String num3 = Num[2];
        String num4 = Num[3];

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);














    }
}