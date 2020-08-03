import java.util.*;

public class RecursionTester {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Rsum sum = new Rsum();
        Rfib fib = new Rfib();
        Rfact fact = new Rfact();
        Rcomma comma = new Rcomma();
        int selection = 1;
        int max = 0;
        int location = 0;
        int factorial = 0;
        String commas = "";

        do{
            System.out.println();
            System.out.println();
            System.out.println("Choose your program");
            System.out.println();
            System.out.println("1: Sum");
            System.out.println("2: Factorial");
            System.out.println("3: Fiboncacci");
            System.out.println("0: Quit");

            System.out.println();

            selection = input.nextInt();

            if(selection == 1){
                System.out.println("Enter the max value: ");
                max = input.nextInt();
                System.out.println("The sum is: " + sum.rSum(max, 0));

            } else if(selection == 2){
                System.out.println("Enter number to factorial: ");
                factorial = input.nextInt();
                System.out.println("The value is: " + fact.solve(factorial));
                
            } else if(selection == 3){
                System.out.println("What number in the Fibonacci Sequence: ");
                location = input.nextInt();
                System.out.println("The value is: " + fib.solve(location));

        }while (selection != 0);



    }
}