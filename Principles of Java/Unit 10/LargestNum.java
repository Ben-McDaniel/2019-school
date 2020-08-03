import java.util.*;

public class LargestNum{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int[] enterNumbers = new int[1000];
        int[] numbers;
        int size = 0;
        int input = 0;

        while (size < 1000 && input >= 0){
            System.out.println("Enter number: ");
            input = scan.nextInt();
            if (input >= 0){
                enterNumbers[size] = input;
                size++;
            }
        }

        numbers = new int[size];
        
        for (int i = 0; i < size; i++){
            numbers[i] = enterNumbers[i];
        }

        Arrays.sort(numbers);

        System.out.println(numbers[size - 1]);

    }
}