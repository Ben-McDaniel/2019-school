//Ben McDaniel

import java.util.*;

public class AccountSetup{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a user name");
        String username = input.nextLine();
        String password;

        do {
            System.out.println("Enter a password with no spaces and at least 8 charcters.");
            password = input.next();
        } while (password.length() < 8);
    }
}