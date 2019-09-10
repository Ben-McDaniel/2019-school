//Ben McDaniel

import java.util.Scanner;

public class GradeAvg{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int g1;
        int g2;
        int g3;
        int g4;
        int g5;
        double avg;

        System.out.println("Enter 5 grades: ");
        g1 = input.nextInt();
        g2 = input.nextInt();
        g3 = input.nextInt();
        g4 = input.nextInt();
        g5 = input.nextInt();


        avg = ((double)g1 + g2 + g3 + g4 + g5) / 5;

        System.out.println(avg);

    }
}