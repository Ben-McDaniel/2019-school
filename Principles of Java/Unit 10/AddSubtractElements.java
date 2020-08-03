import java.util.Scanner;
import java.lang.*;

public class AddSubtractElements {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[] numArray = new int[10];
        int total = 0;
        String opperation = "";

        for (int i = 0; i < numArray.length; i++){
            System.out.println("Enter the number");
            numArray[i] = input.nextInt();
        }

        for (int j = 0; j < numArray.length; j++){
            if(numArray[j] % 2 == 0){
                total += numArray[j];
                StringBuilder sb = new StringBuilder("+" + numArray[j] + " ");
                opperation += sb;
            } else {
                total -= numArray[j];
                StringBuilder sb = new StringBuilder("-" + numArray[j] + " ");
                opperation += sb;
            }
        }

        System.out.println(opperation + " = " + total);
    }
}