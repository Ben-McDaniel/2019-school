//Ben McDaniel
import java.util.Scanner;

public class SurfUp{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int height;
        System.out.println("Enter wave height");
        height = input.nextInt();
        if (height >= 6){
            System.out.println("Great day for Surfing Dude!!");
        }
        else if (height >= 0){
            System.out.println("Go body boarding");
        }
        else {
            System.out.println("Thats some wack syrf");
        }
    }
}