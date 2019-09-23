//Ben McDaniel


//1. Write a program that INPUTS a 4-digit integer. (between 1000 and 9999) ----------------DONE

//2. Assign the input (integer) to a String variable. (CONVERSION) ----------------DONE

//3. Display all of the digits in the String variable vertically - each digit on a separate line. ---------------DONE

//4. Extract each of the four digits 1 by 1, and assign each into 4 separate integer variables. (CONVERSION) ------------DONE

//5. Compute the sum of the 4 variables (representing the sum of the digits in the original input) and store the result in another variable-----------DONE

//6. Attach the SUM variable value to the end of the String variable data (CONCATENATION)----------------DONE

//7. Assign the String variable to the ORIGINAL INPUT variable so that the original input contains both the 4 digits and the SUM of the 4 digits (CONVERSION)------------DONE

//8. Display the ORIGINAL INPUT variable (including the 4 digits and the SUM)----------DONE

//9. Beautify----------------DONE





import java.util.Scanner;
import java.lang.Math;

public class U1FPB{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //imputs the 4 digit number 
        System.out.println("Enter a 4 digit Number");
        System.out.print(">");
        int UserNum = input.nextInt();

        //checks to make sure the number is 4 digits
        if ((UserNum > 999) && (UserNum < 10000)){
        } else{
            System.out.println("Failed: Number was not 4 digits long");
            System.exit(0);
        }


        //assign the varible to a string
        String str = String.valueOf(UserNum); 
        String[] Num = str.split("");
        String num1 = Num[0];
        String num2 = Num[1];
        String num3 = Num[2];
        String num4 = Num[3];

        //prints each number on individual line
        System.out.println("----------------------------------------------------------------");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        //Convert from string to int
        int NumOne = Integer.parseInt(num1);
        int NumTwo = Integer.parseInt(num2);
        int NumThree = Integer.parseInt(num3);
        int NumFour = Integer.parseInt(num4);

        //Adds the numbers together and prints the output
        int Sum = NumOne + NumTwo + NumThree + NumFour;
        System.out.println("----------------------------------------------------------------");
        System.out.println(Sum);

        //Converts the sum to a string
        String strsum = String.valueOf(Sum);

        //Attaches the sum to the original string, using the original var, then prints the whole string
        str = str + strsum;
        System.out.println("----------------------------------------------------------------");
        System.out.println(str);












    }
}