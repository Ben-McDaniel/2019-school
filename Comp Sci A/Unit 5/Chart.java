//Ben McDaniel

import java.util.*;

public class Chart{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int [] ary = new int[1];
        int one = 0, ten = 0, twenty = 0, thirty = 0, fourty = 0, fifty = 0, sixty = 0, seventy = 0, eighty = 0, ninety = 0, hundred = 0,  check = 1;


        while(check != 0){
            System.out.println("Enter a number to add, or 0 to sort");
            check = input.nextInt();

            if (check != 0 && check < 100 && check > 0){
                ary = Arrays.copyOf(ary, ary.length + 1);
                ary[ary.length - 1] = check;
            }
        }
        ary = Arrays.copyOfRange(ary, 1, ary.length);
        Arrays.sort(ary);


        for (int i = 0; i < ary.length; i++){
            if(ary[i] < 11){
                ten++;
            }else if (ary[i] < 21){
                twenty++;
            }else if (ary[i] < 31){
                thirty++;
            }else if (ary[i] < 41){
                fourty++;
            }else if (ary[i] < 51){
                fifty++;
            }else if (ary[i] < 61){
                sixty++;
            }else if (ary[i] < 71){
                seventy++;
            }else if (ary[i] < 81){
                eighty++;
            }else if (ary[i] < 91){
                ninety++;
            }else if (ary[i] < 100){
                hundred++;
            }
            
        }
        System.out.println();
        System.out.print("0-10   | ");
        for (int i = 0; i < ten; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.print("11-20  | ");
        for (int i = 0; i < twenty; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.print("21-30  | ");
        for (int i = 0; i < thirty; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.print("31-40  | ");
        for (int i = 0; i < fourty; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.print("41-50  | ");
        for (int i = 0; i < fifty; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.print("51-60  | ");
        for (int i = 0; i < sixty; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.print("61-70  | ");
        for (int i = 0; i < seventy; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.print("71-80  | ");
        for (int i = 0; i < eighty; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.print("81-90  | ");
        for (int i = 0; i < ninety; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.print("91-100 | ");
        for (int i = 0; i < hundred; i++){
            System.out.print("*");
        }


    }
}