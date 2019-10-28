//Ben McDaniel

public class PairOfDice{
    Die d6a = new Die();
    Die d6b = new Die();

    private int check1, check2;

    public boolean roll(){
        check1 = d6a.roll(6);
        check2 = d6b.roll(6);

        if (check1 == 6 && check2 == 6){
            return(true);
        }else{
            return(false);
        }
    }


}