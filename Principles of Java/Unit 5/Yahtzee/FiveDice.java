 //Designed and Written by Mr. Mosier
//Written for Principles of Java Programming course
public class FiveDice {
    private Die fivedice[];
    
    //Description: Constructor creates the FiveDice object and
    //assigns all "dice" the value 1
    public FiveDice() {
        fivedice = new Die[5];
        for (int i = 0; i < 5; i++) {
            fivedice[i] = new Die();
        }
    }
    
    //Description: Constructor creates the FiveDice object and
    //assigns each die a customer parameter value
    //Pre-condition: Each parameter, a,b,c,d,e, must be between
    //1 and 6 (inclusive)
    //Post-condition: The FiveDice have been assigned and
    //pre-sorted low to high
    public FiveDice(int a, int b, int c, int d, int e) {
        fivedice = new Die[5];
        for (int i = 0; i < 5; i++) {
            fivedice[i] = new Die();
        }
        fivedice[0].setSide(a);
        fivedice[1].setSide(b);
        fivedice[2].setSide(c);
        fivedice[3].setSide(d);
        fivedice[4].setSide(e);
        sort();
    }
    
    
    //Description: setDie assigns a die object a corresponding value
    //Pre-condition: die represents a die numeric die object and must
    //be between 1 and 5 (inclusive)
    //...............value represents a valid die side and must be
    //between 1 and 6 (inclusive)
    //Post-condition: Returns TRUE if assigned successfully,
    //FALSE otherwise. The dice have been resorted low to high.
    public boolean setDie(int die, int value) {
        if ((die >= 1 && die <= 5) && (value >= 1 && value <= 6)) {
            fivedice[die+1].setSide(value);
            sort();
            return true;
        } else {
            return false;
        }
    }
    
    //Description: rollFiveDice randomly rolls all 5 die objects
    //Post-condition: Dice have been randomized and sorted
    //lost to high.
    public void rollFiveDice() {
        for (int i = 0; i < 5; i++) {
            fivedice[i].roll();
        }
        sort();
    }
    
    //Description: rollDie rolls a selected die object
    //Pre-condition:"die" must be a die 1 to 5 (inclusive)
    //Post-condition: the specified die has been randomly assigned
    //The dice have been sorted.
    public void rollDie(int die) {
        fivedice[die-1].roll();
        sort();
    }
    
    //Description: This rollDice rolls selected die objects
    //Pre-condition: a,b,c,d,e each refer to a specific valid die object
    //(a = Die1, b = Die2, c = Die3, d = Die4, e = die5)
    //A TRUE value indicates that you WANT TO ROLL the corresponding die
    //A FALSE value indicates that you DO NOT WANT TO ROLL the die
    //Post-condition: the specified dice have been randomly assigned
    //The dice have been sorted.
    public void rollDice(boolean a, boolean b, boolean c, boolean d, boolean e) {
        if (a)
            fivedice[0].roll();
        if (b)
            fivedice[1].roll();
        if (c)
            fivedice[2].roll();
        if (d)
            fivedice[3].roll();
        if (e)
            fivedice[4].roll();
        sort();
    }
    
    //Description: This rollDice rolls selected die objects
    //Pre-condition: "dice" MUST include valid dice numbers representing
    //specific die locations (i.e. to roll die 1 -> "1" must be in the
    //String ("315"), to roll die 4 -> "4" must be in the String ("456")
    //, etc.).
    //Post-condition: the specified dice have been randomly assigned
    //The dice have been sorted.
    public boolean rollDice(String dice) {
        for (int i = 0; i < dice.length(); i++) {
            try {
                new Integer(dice.substring(i,i+1));
            } catch (Exception e) {
                return false;
            }
            rollDie(new Integer(dice.substring(i,i+1)));
        }
        sort();
        return true;
    }
    
    
    //Description: sort sorts the die low to high left to right
    //Post-condition: The dice have been sorted low to high
    //left to right (1 to 5)
    public void sort() {
        for (int i = 0; i < 5; i++)  {
            for (int j = 0; j < 4; j++) {
                if (fivedice[j].getSide() > fivedice[j+1].getSide()) {
                    int temp = fivedice[j].getSide();
                    fivedice[j].setSide(fivedice[j+1].getSide());
                    fivedice[j+1].setSide(temp);
                }
            }
        }
    }
    
    //Description: getDie returns the value of a die object
    //Pre-condition:"die" must be a die 1 to 5 (inclusive)
    //Post-condition: the specified die value has been returned
    public int getDie(int die) {
        return fivedice[die-1].getSide();
    }
    
    //Description: getTextDie returns the value of a die object
    //as a String type (text form)
    //Pre-condition: "die" must be a die 1 to 5 (inclusive)
    //Post-condition: the specified die value has been returned
    //as a String
    public String getTextDie(int die) {
        return fivedice[die-1].toTextSide();
    }
    
    //Description: countValue counts the number of dice that
    //have the value as their current side
    //Pre-condition: "value" must be a valid die side (1 to 6)
    //...............(incusive)
    //Post-condition: The number of dice that currently have "value"
    //as their current side has been returned
    public int countValue(int value) {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            if (fivedice[i].getSide() == value) {
                total++;
            }
        }
        return total;
    }
    
    //Description: count1s returns the # of "1" dice
    //Post-condition: The # of die showing a 1 has been returned
    public int count1s() {
        return countValue(1);
    }
    
    //Description: count2s returns the # of "2" dice
    //Post-condition: The # of die showing a 2 has been returned
    public int count2s() {
        return countValue(2);
    }
    
    //Description: count3s returns the # of "3" dice
    //Post-condition: The # of die showing a 3 has been returned
    public int count3s() {
        return countValue(3);
    }
    
    //Description: count4s returns the # of "4" dice
    //Post-condition: The # of die showing a 4 has been returned
    public int count4s() {
        return countValue(4);
    }
    
    //Description: count5s returns the # of "5" dice
    //Post-condition: The # of die showing a 5 has been returned
    public int count5s() {
        return countValue(5);
    }
    
    //Description: count6s returns the # of "6" dice
    //Post-condition: The # of die showing a 6 has been returned
    public int count6s() {
        return countValue(6);
    }
    
    //Description: isLargeStraight determines if the 5 dice
    //contain a yahtzee large straight (all 5 dice in ascending
    //order)
    //Post-condition: Returns TRUE if a "Large Straight",
    //FALSE otherwise.
    public boolean isLargeStraight() {
        if (fivedice[0].getSide() < fivedice[1].getSide() &&
            fivedice[1].getSide() < fivedice[2].getSide() &&
            fivedice[2].getSide() < fivedice[3].getSide() &&
            fivedice[3].getSide() < fivedice[4].getSide()) {
                return true;
        } else {
            return false;
        }
    }
    
    //Description: isSmallStraight determines if the 5 dice
    //contain a yahtzee small straight (at least 4 dice in
    //ascending order)
    //Post-condition: Returns TRUE if a "Small Straight",
    //FALSE otherwise.
    public boolean isSmallStraight() {
        if ((fivedice[0].getSide() < fivedice[1].getSide() &&
             fivedice[1].getSide() < fivedice[2].getSide() &&
             fivedice[2].getSide() < fivedice[3].getSide()) ||
            (fivedice[1].getSide() < fivedice[2].getSide() &&
             fivedice[2].getSide() < fivedice[3].getSide() &&
             fivedice[3].getSide() < fivedice[4].getSide())) {
                return true;
        } else {
            return false;
        }
    }
    
    //Description: isThreeKind determines if the 5 dice
    //contain a yahtzee three of a kind (3 of the same #)
    //Post-condition: Returns TRUE if "Three of a Kind",
    //FALSE otherwise.
    public boolean isThreeKind() {
        if ((fivedice[0].equals(fivedice[1]) &&
             fivedice[0].equals(fivedice[2])) ||
            (fivedice[1].equals(fivedice[2]) &&
             fivedice[1].equals(fivedice[3])) ||
            (fivedice[2].equals(fivedice[3]) &&
             fivedice[3].equals(fivedice[4]))) {
                return true;
        } else {
                return false;
        }
    }
    
    //Description: isFourKind determines if the 5 dice
    //contain a yahtzee four of a kind (4 of the same #)
    //Post-condition: Returns TRUE if "Four of a Kind",
    //FALSE otherwise.
    public boolean isFourKind() {
        if ((fivedice[0].equals(fivedice[1]) &&
             fivedice[0].equals(fivedice[2]) &&
             fivedice[0].equals(fivedice[3])) ||
            (fivedice[1].equals(fivedice[2]) &&
             fivedice[1].equals(fivedice[3]) &&
             fivedice[1].equals(fivedice[4]))) {
                return true;
        } else {
                return false;
        }
    }
    
    //Description: isFiveKind determines if the 5 dice
    //contain a YAHTZEE! (All 5 of the same #)
    //Post-condition: Returns TRUE if "Yahtzee",
    //FALSE otherwise.
    public boolean isFiveKind() {
        if (fivedice[0].equals(fivedice[1]) &&
            fivedice[0].equals(fivedice[2]) &&
            fivedice[0].equals(fivedice[3]) &&
            fivedice[0].equals(fivedice[4])) {
                return true;
        } else {
                return false;
        }
    }
    
    //Description: isFullHouse determines if the 5 dice
    //contain a yahtzee three of a kind, AND a pair of #'s
    //Post-condition: Returns TRUE if "Full House",
    //FALSE otherwise.
    public boolean isFullHouse() {
        if ((fivedice[0].equals(fivedice[1]) &&
             fivedice[2].equals(fivedice[3]) &&
             fivedice[2].equals(fivedice[4])) ||
            (fivedice[0].equals(fivedice[1]) &&
             fivedice[0].equals(fivedice[2]) &&
             fivedice[3].equals(fivedice[4]))) {
                 return true;
        } else {
                 return false;
        }
    }
    
    //Description: sumDice returns the total value of all dice
    //Post-condition: The sum of all dice has been returned.
    public int sumDice() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += fivedice[i].getSide();
        }
        return sum;
    }
    
    //Description: Returns true if both FiveDice objects contain
    //the same die object current sides, False otherwise
    public boolean equals(Object o) {
        FiveDice f = (FiveDice) o;
        for (int i = 0; i < 5; i++) {
            if (f.fivedice[i] != fivedice[i])
                return false;
        }
        return true;
    }
    
    //Description: Returns a String representation of all dice
    public String toString() {
        return fivedice[0] + " " + 
               fivedice[1] + " " +
               fivedice[2] + " " +
               fivedice[3] + " " +
               fivedice[4];
    } 
    
}
