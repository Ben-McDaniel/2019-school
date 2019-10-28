//Ben McDaniel

import java.lang.*;
import java.util.*;

public class PairOfDice{
    Die d6a = new Die();
    Die d6b = new Die();

    private int check1, check2;

    public int roll(){
        check1 = d6a.roll(6);
        check2 = d6b.roll(6);

        return(check1 + check2);
        
    }


}