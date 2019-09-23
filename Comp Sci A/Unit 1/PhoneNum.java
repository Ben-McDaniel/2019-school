//Ben McDaniel

import java.util.Random;


public class PhoneNum{
    public static void main(String[]args){
        Random rand = new Random();
        int first1;
        int first2;
        int first3;
        int mid;
        int last;

        
        
        first1 = rand.nextInt(6) + 1;
        first2 = rand.nextInt(6) + 1;
        first3 = rand.nextInt(6) + 1;
        mid = rand.nextInt(642) + 100;
        last = rand.nextInt(8999) + 1000;

        System.out.printf("%d%d%d" + "-" + mid + "-" + last ,first1, first2, first3);
    }

}