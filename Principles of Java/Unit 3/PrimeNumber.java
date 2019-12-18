//Ben McDaniel

import java.util.*;

public class PrimeNumber{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int check, num1, num2, flag = 0;

        System.out.println("Enter a number to check if its prime: ");
        check = input.nextInt();
        int m = check / 2;
        if(check==0||check==1){
            System.out.println(check + " is not prime number");    
           }else{
            for(int i=2;i<=m;i++){    
             if(check % i == 0){    
              System.out.println(check + " is not prime number");    
              flag=1;    
              break;    
             }    
            }    
            if(flag==0)  { System.out.println(check + " is prime number"); }
           }
    }
}