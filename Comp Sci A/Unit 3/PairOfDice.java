//Ben McDaniel

import java.lang.*;
import java.util.*;

public class PairOfDice{
    Die d6a = new Die();
    Die d6b = new Die();

    private int check1, check2;

    
    public int[] roll(){
        int number1 = d6a.roll(6);
        int number2 = d6b.roll(6);
        return new int[] {number1, number2};       
    }


}