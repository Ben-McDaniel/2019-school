//Ben McDaniel

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;

public class SearchingAndSorting{
    public static void main(String[]args){
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
                System.out.println("What Number are you looking for:");
                int number = input.nextInt();
                System.out.println("The Number is in position " + linearSearch(ary, number));
            } else if(answer == 2){
                System.out.println("What Number are you looking for:");
                int number = input.nextInt();
                System.out.println("The Number is in position " + binarySearch(ary, number));
            } else if(answer == 3){
                selectionsort(ary);
                System.out.println(Arrays.toString(ary));
            } else if(answer == 4){
                bubblesort(ary);
                System.out.println(Arrays.toString(ary));
            } else if(answer == 5){
                insertionSort(ary);
                System.out.println(Arrays.toString(ary));
            }
        }

       
    }

    public static int linearSearch(int [] array, int num){
            int n = array.length; 
        for(int i = 0; i < n; i++) 
        { 
            if(array[i] == num) 
                return i; 
        } 
        return -1; 
    }

    public static int binarySearch(int [] array, int num){
        int l = 0, r = array.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 

            if (array[m] == num){ 
                return m; 
            } else if (array[m] < num){ 
                l = m + 1; 
            } else{
                r = m - 1; 
            }
        } 
 
        return -1; 
    }

    public static int [] selectionsort(int [] array){
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

    public static int [] bubblesort(int [] array){
        int items = 0;
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int j = 0; j < array.length - 1; j++){
                items++;
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array [j + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public static int [] insertionSort(int [] array){
        int n = array.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = array[i]; 
            int j = i-1; 

            while (j>=0 && array[j] > key) 
            { 
                array[j+1] = array[j]; 
                j = j-1; 
            } 
            array[j+1] = key; 
        } 
        return array;
    }

}