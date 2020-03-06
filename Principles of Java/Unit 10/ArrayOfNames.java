import java.util.Scanner;
import java.lang.*;

public class ArrayOfNames {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String[] friends = new String[5];
        String friendList = "";

        for (int i = 0; i < friends.length; i++){
            System.out.println("Enter the name of friend number " + (i + 1));
            friends[i] = input.next();
        }

        for (int j = 0; j < friends.length; j++){
            StringBuilder sb = new StringBuilder(friends[j] + " ");
            friendList += sb;
        }

        System.out.println(friendList);
    }
}