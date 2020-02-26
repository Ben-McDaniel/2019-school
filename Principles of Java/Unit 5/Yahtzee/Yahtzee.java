import java.util.*;



public class Yahtzee{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        FiveDice fDice = new FiveDice();
        ScoreCard sc = new ScoreCard();
        fDice.rollFiveDice();
        System.out.println(fDice);
        System.out.println(sc.getScoreCard());
    }
}