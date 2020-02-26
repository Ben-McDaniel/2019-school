//Designed and Written by Mr. Mosier
//Written for Principles of Java Programming course
public class Die {
    private int side;

    //Description: Constructor creates die object facing side 1
    public Die()
    {
        side = 1;
    }
    
    //Description: Constructor creates the die object and
    //assigns "side" the value "s"
    //Pre-condition: "s" MUST be between 1 and 6 (inclusive)
    public Die(int s) {
        setSide(s);
    }

    //Description: Constructor takes in any boolean value and
    //randomly initializes the side to a random value between
    //1 and 6 (inclusive)
    public Die (boolean b) {
        roll();
    }
    
    //Method assigns "side" the value "s"
    //Pre-condition: "s" MUST be between 1 and 6 (inclusive)
    //Post-condition: If successful, returns "true",
    //                otherwise returns "false"
    public boolean setSide(int s) {
        if (s >= 1 && s <= 6) {
            side = s;
            return true;
        } else {
            return false;
        }
    }

    //Method assigns "side" is randomly assigned a value
    //                between 1 and 6 (inclusive)
    //Post-condition: "side" is returned
    public int roll() {
        side = (int)(6 * Math.random() + 1);
        return side;
    }
    
    //Method obtains the value of side from the die object
    //Post-condition: "side" is returned
    public int getSide() {
        return side;
    }
    
    //Method determines if 2 die objects have the same side
    //Pre-condition: "o" must reference a value Die object
    //Post-condition: "true" is returned if both dice have the
    //                same side, "false" otherwise
    public boolean equals(Object o) {
        Die d = (Die)o;
        if (d.side == side) {
            return true;
        } else {
            return false;
        }
    }
    
    //Method returns a text value representing the "side"
    //Post-condition: an equalivalent text-based word is
    //                returned based on the "side" value
    public String toTextSide() {
        if (side == 1)
            return "ONE";
        if (side == 2)
            return "TWO";
        if (side == 3)
            return "THREE";
        if (side == 4)
            return "FOUR";
        if (side == 5)
            return "FIVE";
        else
            return "SIX";
    }
    
    //Method returns 
    public String toString() {
        return toTextSide();
    }
}
