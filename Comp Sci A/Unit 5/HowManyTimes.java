//Ben McDaniel

import java.util.*;

public class HowManyTimes{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int longAmount, howMany = 1;
        int num = 0;
        int minus = 1;
        boolean check = true;

        //Input of numbers for any amount
        int [] array = new int[1];
        while (num != 100 ){
            System.out.println("Enter a number before 0-50, or '100' to quit");
            num = input.nextInt();

            if (num != 100 && num < 51 && num > -1){
                array = Arrays.copyOf(array, array.length + 1);
                array[array.length - 1] = num;
            }
        }

        //Setting up array, and getting some numbers for later use
        int [] array2 = Arrays.copyOfRange(array, 1, array.length);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));        
        longAmount = array2.length - 1;
        

        //Does all but the final value and amount of times it was entered
        for (int i = 0; i < longAmount; i++){
            if(array2[i] == array2[(i + 1)]){
                howMany++;
            }else{
                if(i == 0){
                    System.out.println(array2[i] + " | 1");
                }else{
                    System.out.println(array2[i] + " | " + howMany);
                    howMany = 1;
                }
            }
        }

        howMany = 1;
        //for final value
        while(check == true){
            if(array2[array2.length - 1] == array2[array2.length - minus]){
                if(minus != 1){
                    howMany++;
                }
                minus++;
            }else{
                check = false;
            }
        }
        System.out.println(array2[array2.length - 1] + " | " + howMany);




    }
}









