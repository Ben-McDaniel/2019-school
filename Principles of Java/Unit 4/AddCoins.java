//Ben McDaniel

import java.util.*;

public class AddCoins{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int q, d, n, p;
        System.out.println("Enter Number of Quarters");
        q = input.nextInt();
        System.out.println("Enter Number of Dimes");
        d = input.nextInt();
        System.out.println("Enter Number of Nickles");
        n = input.nextInt();
        System.out.println("Enter Number of Pennies");
        p = input.nextInt();

        System.out.println(getDollarAmount(q, d, n, p));
    }

    public static String getDollarAmount(int Q, int D, int N, int P){
        double total;
        total = (Q * .25) + (D * .1) + (N * .05) + (P * .01);
        int fix = (int)(total*100);
        total = (double)fix/100;
        return "$" + total;
    }
}