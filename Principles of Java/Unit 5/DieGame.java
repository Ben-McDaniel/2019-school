import java.util.Scanner;

public class DieGame {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Die dp = new Die();
        Die dc = new Die();
        int choice = 0; 
        int p = 0;
        int c = 0; 
        int t = 0;


        for (int i = 1; i <= 20; i++){
            System.out.println("1) Roll or 2) Forefit");
            choice = input.nextInt();

            if (choice == 2){
                break;
            } else{
                if (dp.roll() > dc.roll()){
                    p++;
                    System.out.println("Player Rolled higher");
                } else if (dc.roll() > dp.roll()){
                    c++;
                    System.out.println("Computer Rolled higher");
                } else {
                    t++;
                    System.out.println("TIE");
                }
            }

            System.out.println("SCORE:");
            System.out.println("Player: " + p);
            System.out.println("Computer: " + c);
            System.out.println("Tie: " + t);
            System.out.println("         Round " + i);
            System.out.println("==========================");
            System.out.println();
            System.out.println();
        }

        if(c > p || choice == 2){
            System.out.println("You Loose!");
        } else if (p > c){
            System.out.println("You Win!");
        } else{
            System.out.println("TIE!");
        }
    }
}