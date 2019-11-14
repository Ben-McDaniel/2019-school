//Ben McDaniel

import java.util.*;

public class FormalGreeting{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name with full title");
        String name = input.nextLine().toLowerCase();
        if (name.startsWith("mrs") || name.startsWith("ms") || name.startsWith("miss")){
            System.out.println("Howdy ma'am");
        } else{
            System.out.println("Howdy partner");
        }
    }
}