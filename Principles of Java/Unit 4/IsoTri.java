import java.util.*;

public class IsoTri{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int barAmount = 0;

        for (int i = size; i > 0; i--){
            System.out.print(addSpaces(i));
            System.out.println(drawBar(barAmount));
            barAmount++;
        }
    }

    public static String drawBar(int x){
        String totalBar = "*";
        for (int i = 0; i < x; i++){
            totalBar = totalBar + "**";
        }
        return totalBar;
    }

    public static String addSpaces(int y){
        String totalSpaces = "";
        for(int i = 0; i < y; i++){
            totalSpaces = totalSpaces + " ";
        }
        return totalSpaces;
    }

}