//Ben McDaniel

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;

public class SearchingAndSorting{
    public static int[] main(String[]args){
        Scanner input = new Scanner(System.in);
        int amount, num, answer = 0 ;

        System.out.println("How many numbers in the array: ");
        amount = input.nextInt();

        int[] ary = new int [amount];
        
        for (int i = 0; i < amount; i++){
            num = new Random().nextInt(10000);
            Array.set(ary, i, num);
        }

        System.out.println(Arrays.toString(ary));

        while (answer != 6){
            System.out.println("Enter the Number for what action you want: ");
            System.out.println("1. Linerar/Sequential Sort");
            System.out.println("2. Binary Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Bubble Sort");
            System.out.println("5. Insertion Sort");
            System.out.println("6. QUIT");

            answer = input.nextInt();

            if (answer == 1){

            } else if(answer == 2){

            } else if(answer == 3){
                System.out.println(selectionsort(ary));
            } else if(answer == 4){

            } else if(answer == 5){

            }else if(answer == 6){

            }
        }

        public static int[] selectionsort(int [] array){
            int temp, minimum;
            for (int index = 0; index < array.length - 1; index++){
                minimum = index;
                for (int scan = index + 1; scan < array.length; scan++){
                    if (array[scan] < array[minimum]){
                        minimum = scan;
                    }
                }
                temp = array[minimum];
                array[minimum] = array[index];
                array[index] = temp;
            }
            return array;
        }
    }
}