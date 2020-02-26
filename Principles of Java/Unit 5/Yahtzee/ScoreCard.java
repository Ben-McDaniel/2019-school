//Designed and Written by Mr. Mosier
//Written for Principles of Java Programming course
public class ScoreCard {
    private int scorecard[];
    
    //Description: Constructor creates the ScoreCard object
    //Each item in the scoreboard list is initialized to -1
    //For our purposes, -1 means "No Score Assigned"
    public ScoreCard() {
        scorecard = new int[16];
        for (int i = 0; i < 16; i++) {
            scorecard[i] = -1;
        }
    }
    
    //Description: convertToIndex takes in a String scoring item
    //and converts it to the equivalent list location
    //Pre-condition: "item" MUST be one of the possible items
    //that can be scored on a standard yahtzee scorecard
    //(NOTE: See "setScore()" below for a complete description
    //of all known "items" that can be scored)
    public int convertToIndex(String item) {
        if (item.trim().equalsIgnoreCase("1"))
            return 0;
        if (item.trim().equalsIgnoreCase("2"))
            return 1;
        if (item.trim().equalsIgnoreCase("3"))
            return 2;
        if (item.trim().equalsIgnoreCase("4"))
            return 3;
        if (item.trim().equalsIgnoreCase("5"))
            return 4;
        if (item.trim().equalsIgnoreCase("6"))
            return 5;
        if (item.trim().equalsIgnoreCase("three"))
            return 8;
        if (item.trim().equalsIgnoreCase("four"))
            return 9;    
        if (item.trim().equalsIgnoreCase("full"))
            return 10;
        if (item.trim().equalsIgnoreCase("small"))
            return 11;
        if (item.trim().equalsIgnoreCase("large"))
            return 12;
        if (item.trim().equalsIgnoreCase("chance"))
            return 13;    
        if (item.trim().equalsIgnoreCase("yahtzee"))
            return 14;
        return -1;
    }
    
    //Description: numbersCompleted determines if the #'s
    //1 - 6 have all be scored at the top of the scorecard
    //and to make things easier, automatically calculates
    //and stores their "sum" if they are completed
    //Post-condition: Returns true if #'s 1 - 6 have been
    //scored, and their sum has been recorded as well
    //...False if 1 or more still needs to be scored
    public boolean numbersCompleted() {
        int score = 0;
        for (int i = 0; i < 6; i++) {
            if (scorecard[i] == -1) {
                return false;
                
            }
            score += scorecard[i];
        }
        scorecard[6] = score;
        if (score >= 63) {
            scorecard[7] = 35;
        } else {
            scorecard[7] = 0;
        }
        return true;
    }
    
    //Description: scoreCardCompleted determines if all of
    //the scoreable items on the scorecard have been filled
    //...and to make things easier, automatically records the
    //total score at the bottom of the scorecard if all scores
    //have been entered.
    //Post-condition: Returns true if all scorecard items have
    //been scored, and their sum has been recorded as well
    //...False if 1 or more still needs to be scored
    public boolean scoreCardCompleted() {
        if (!numbersCompleted())
            return false;
        int score = 0;
        for (int i = 6; i < 15; i++) {
            if (scorecard[i] == -1) {
                return false;
            }
            score += scorecard[i];
        }
        scorecard[15] = score;
        return true;
    }
    
    //Description: setScore assigns a score to it's
    //corresponding item
    //Pre-condition: "item" MUST be one of the possible items
    //that can be scored on a standard yahtzee scorecard
    //Coded "items" and their corresponding conversions are as
    //follows: "1" = Ones, "2" = Twos, "3" = Threes, "4" = Fours
    //"5" = Fives, "6" = Sixes, "three" = Three of a Kind,
    //"four" = "Four of Kind", "small" = "Small Straight,
    //"large" = Large Straight, "full" = Full House,
    //"chance" = chance, "yahtzee" = yahtzee
    //Any other "item" value is considered invalid and may
    //nullify the validity of this (and all other) methods
    //..............."score" must be a valis score for that
    //specific item on the scorecard based on yahtzee rules
    //Post-condition: Returns TRUE if score set correctly,
    //               ...FALSE otherwise
    public boolean setScore(String item, int score) {
        if (convertToIndex(item) == -1)
            return false;
        scorecard[convertToIndex(item)] = score;
        return true;
    }
    
    //Description: getTotalScore returns the total scorecard score
    //Post-condition: The total score has been returned
    public int getTotalScore() {
        return scorecard[15];
    }
  
    //Description: getScore returns a score corresponding to
    //the "item" parameter
    //Pre-condition: "item" MUST be one of the possible items
    //that can be scored on a standard yahtzee scorecard
    //See "setScore" above for item coding details 
    //Any other "item" value is considered invalid and may
    //nullify the validity of this (and all other) methods
    //Post-condition: the "score" of that item is returned
    public int getScore(String item) {
        if (convertToIndex(item) == -1)
            return -1;
        return scorecard[convertToIndex(item)];
    }
    
    //Description: toTextScore converts a list location to
    //its corresponding text for "neat output purposes"
    //Pre-condition: "index" MUST be between 0 and 15 (inclusive)
    //Post-condition: If a valid score is present, the score is
    //returned in String format, or a blank (" ") is returned
    //if it is not
    public String toTextScore(int index) {
        if (scorecard[index] == -1)
            return " ";
        return "" + scorecard[index];
    }
    
    //Description: isScored determines if a particular item
    //on the scorecard has already been scored or not
    //Pre-condition: "item" MUST be one of the possible items
    //that can be scored on a standard yahtzee scorecard
    //See "setScore" above for item coding details 
    //Any other "item" value is considered invalid and may
    //nullify the validity of this (and all other) methods
    //Post-condition: Returns TRUE if the "item" has been
    //scored, and FALSE otherwise
    public boolean isScored(String item) {
        if (convertToIndex(item) == -1)
            return false;
        if (scorecard[convertToIndex(item)] == -1)
            return false;
        return true;
    }
    
    //Description: getScoreCard returns a String representing
    //the yahtzee scorecard including all items and their scores
    //Post-condition: The scorecard has been returned as a String.
    //................All unscored items are returned as blank scores
    //and include a # for use in a menu (if applicable)
    //................Scored items are returned as scores and
    //will not include a # for selection usage (if applicable)
    public String getScoreCard() {
        String board = "";
        if (isScored("1"))
            board += "              Ones: " + toTextScore(0) + "\n";
        else
            board += "1.            Ones: " + toTextScore(0) + "\n";
        if (isScored("2"))
            board += "              Twos: " + toTextScore(1) + "\n";
        else
            board += "2.            Twos: " + toTextScore(1) + "\n";
        if (isScored("3"))
            board += "            Threes: " + toTextScore(2) + "\n";
        else
            board += "3.          Threes: " + toTextScore(2) + "\n";
        if (isScored("4"))
            board += "              Four: " + toTextScore(3) + "\n";
        else
            board += "4.            Four: " + toTextScore(3) + "\n";
        if (isScored("5"))
            board += "              Five: " + toTextScore(4) + "\n";
        else
            board += "5.            Five: " + toTextScore(4) + "\n";    
        if (isScored("6"))
            board += "               Six: " + toTextScore(5) + "\n";
        else
            board += "6.             Six: " + toTextScore(5) + "\n";     
        board +=     "               Sum: " + toTextScore(6) + "\n";
        board +=     "             Bonus: " + toTextScore(7) + "\n";
        if (isScored("three"))
            board += "   Three of a Kind: " + toTextScore(8) + "\n";
        else
            board += "7. Three of a Kind: " + toTextScore(8) + "\n"; 
        if (isScored("four"))
            board += "    Four of a Kind: " + toTextScore(9) + "\n";
        else
            board += "8.  Four of a Kind: " + toTextScore(9) + "\n";
        if (isScored("full"))
            board += "        Full House: " + toTextScore(10) + "\n";
        else
            board += "9.      Full House: " + toTextScore(10) + "\n";
        if (isScored("small"))
            board += "    Small Straight: " + toTextScore(11) + "\n";
        else
            board += "10. Small Straight: " + toTextScore(11) + "\n";  
        if (isScored("large"))
            board += "    Large Straight: " + toTextScore(12) + "\n";
        else
            board += "11. Large Straight: " + toTextScore(12) + "\n"; 
        if (isScored("chance"))
            board += "            Chance: " + toTextScore(13) + "\n";
        else
            board += "12.         Chance: " + toTextScore(13) + "\n";
        if (isScored("yahtzee"))
            board += "           Yahtzee: " + toTextScore(14) + "\n";
        else
            board += "13.        Yahtzee: " + toTextScore(14) + "\n";  
        board +=     "       Total Score: " + toTextScore(15) + "\n";
        return board;
    }
    
    //See "getScoreCard" above
    public String toString() {
        return getScoreCard();
    }

}