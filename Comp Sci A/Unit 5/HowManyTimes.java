//Ben McDaniel

import java.util.*;

public class HowManyTimes{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int whatNum, howMany = 1;
        int num = 0;

        int [] array = new int[1];
        while (num != 100 ){
            System.out.println("Enter a number before 0-50, or '100' to quit");
            num = input.nextInt();

            if (num != 100 && num < 51 && num > -1){
                array = Arrays.copyOf(array, array.length + 1);
                array[array.length - 1] = num;
            }
        }

        int [] array2 = Arrays.copyOfRange(array, 1, array.length);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);
        



    }
}









