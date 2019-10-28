//Ben McDaniel

public class BoxCars{
    public static void main(String[]args){
        PairOfDice dice = new PairOfDice();
        int correctTimes = 0;

        for (int i = 0; i < 100000; i++){
            boolean res = dice.roll();
            System.out.println(res);
            if (res == true){
                correctTimes++;
            }
        }
        System.out.println("Boxcars were rolled " + correctTimes + " times.");
    }
}