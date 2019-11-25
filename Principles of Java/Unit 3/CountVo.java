//Ben McDaniel

import java.util.*;

public class CountVo{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String text;
        int total = 0;
        String letter;
        System.out.println("Enter text: ");
        text = input.nextLine();
        for (int i = 0; i < text.length(); i++){
            letter = text.substring(i, i+1);
            if (letter.equalsIgnoreCase("a") ||  letter.equalsIgnoreCase("e") ||  letter.equalsIgnoreCase("i") ||  letter.equalsIgnoreCase("o") ||  letter.equalsIgnoreCase("u")){
                total++;
            }
        }
        System.out.println("Total vowels: " + total);
    }
}