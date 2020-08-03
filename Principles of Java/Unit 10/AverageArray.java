import java.util.Scanner;


public class AverageArray {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double[] numArray = new double[5];
        double total = 0;

        for (int i = 0; i < numArray.length; i++){
            System.out.println("Enter the number");
            numArray[i] = input.nextInt();
        }

        for (int j = 0; j < numArray.length; j++){
            total = total + numArray[j];
        }

        System.out.println(total / numArray.length);
    }
}