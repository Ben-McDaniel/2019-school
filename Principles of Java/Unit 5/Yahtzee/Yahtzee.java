import java.util.*;



public class Yahtzee{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        FiveDice d = new FiveDice();
        ScoreCard s = new ScoreCard();
        int rollsleft = 3;
        String rs = "";

        do{
            System.out.println(s);
            if(rollsleft == 3){
                d.rollFiveDice();
                rollsleft--;
            }
            System.out.println(d);
            System.out.println(d.getDiceNumbers());
            if (rollsleft > 0){
                System.out.println("Rolls left: " + rollsleft);
                System.out.print("(R)oll again or (S)core the turn?");
                input = new Scanner(System.in);
                rs = input.next().substring(0,1).toLowerCase();
                input = new Scanner(System.in);
            } else {
                rs = "s";
            }

            if(rs.equals("r")){
                System.out.println("ENter the numbers of the dice you want to reroll: ");
                input = new Scanner(System.in);
                String dice = input.nextLine();
                input = new Scanner(System.in);
                boolean valid = true;
                if (d.rollDice(dice) == true){
                    rollsleft--;
                }
            } else if (rs.equals("s")){
                System.out.print("Enter a valid scoring category number (1-13): ");
                input = new Scanner(System.in);
                String cat = input.next();
                input = new Scanner(System.in);
                if (cat.equals("1") && !s.isScored("1")){
                    s.setScore("1", d.count1s() * 1);
                    rollsleft = 3;
                } else if (cat.equals("2") && !s.isScored("2")){
                    s.setScore("2", d.count2s() * 2);
                    rollsleft = 3;
                } else if (cat.equals("3") && !s.isScored("3")){
                    s.setScore("3", d.count3s() * 3);
                    rollsleft = 3;
                } else if (cat.equals("4") && !s.isScored("4")){
                    s.setScore("4", d.count4s() * 4);
                    rollsleft = 3;
                } else if (cat.equals("5") && !s.isScored("5")){
                    s.setScore("5", d.count5s() * 5);
                    rollsleft = 3;
                } else if (cat.equals("6") && !s.isScored("6")){
                    s.setScore("6", d.count6s() * 6);
                    rollsleft = 3;
                } else if (cat.equals("7") && !s.isScored("7")){
                    if (d.isThreeKind()){
                        s.setScore("three", d.sumDice());
                    } else {
                        s.setScore("three", 0);
                    }
                    rollsleft = 3;
                } else if (cat.equals("8") && !s.isScored("8")){
                    if (d.isFourKind()){
                        s.setScore("four", d.sumDice());
                    } else {
                        s.setScore("four", 0);
                    }
                    rollsleft = 3;
                } else if (cat.equals("9") && !s.isScored("9")){
                    if (d.isFullHouse()){
                        s.setScore("full", 25);
                    } else {
                        s.setScore("full", 0);
                    }
                    rollsleft = 3;
                } else if (cat.equals("10") && !s.isScored("10")){
                    if (d.isSmallStraight()){
                        s.setScore("small", 30);
                    } else {
                        s.setScore("small", 0);
                    }
                    rollsleft = 3;
                } else if (cat.equals("11") && !s.isScored("11")){
                    if (d.isLargeStraight()){
                        s.setScore("large", 40);
                    } else {
                        s.setScore("large", 0);
                    }
                    rollsleft = 3;
                } else if (cat.equals("12") && !s.isScored("12")){
                    s.setScore("chance", d.sumDice());
                    rollsleft = 3;
                } else if (cat.equals("13") && !s.isScored("13")){
                    if (d.isFiveKind()){
                        s.setScore("yahtzee", 50);
                    } else {
                        s.setScore("yahtzee", 0);
                    }
                    rollsleft = 3;
                } 
            }
        } while (!s.scoreCardCompleted());
        System.out.println(s);
    }
}