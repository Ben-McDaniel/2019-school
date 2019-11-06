//Ben McDaniel

import java.util.*;

public class Card{
    Random generator = new Random();
    public int suitNum, numNum;
    public String suit;
    public String num;

    public String create(){
        suitNum = generator.nextInt(4) + 1;
        numNum = generator.nextInt(13) + 1;

        if (suitNum == 1){
            suit = "Diamonds";
        }else if (suitNum == 2){
            suit = "Hearts";
        }else if (suitNum == 3){
            suit = "Clubs";
        }else if (suitNum == 4){
            suit = "Spades";
        }

        if (numNum == 1){
            num = "Ace of ";
        }else if (numNum == 2){
            num = "Two of ";
        }else if (numNum == 3){
            num = "Three of ";            
        }else if (numNum == 4){
            num = "Four of ";            
        }else if (numNum == 5){
            num = "Five of ";
        }else if (numNum == 6){
            num = "Six of ";
        }else if (numNum == 7){
            num = "Seven of ";
        }else if (numNum == 8){
            num = "Eight of ";
        }else if (numNum == 9){
            num = "Nine of ";
        }else if (numNum == 10){
            num = "Ten of ";
        }else if (numNum == 11){
            num = "Jack of ";
        }else if (numNum == 12){
            num = "Queen of ";
        }else if (numNum == 13){
            num = "King of ";
        }
        return(num + suit);
    }







}