//Ben McDaniel

public class Card{
    public int face;
    public int suit;

    public Card(){
        Card c = random();
    }

    public Card(int face, int suit){
        this.face = face;
        this.suit = suit;
    }

    public Card(String face, String suit){
        setCard(face, suit);
    }

    public Card random(){
        int f = (int)((13 - 1 + 1) * Math.random() + 1);
        int s = (int)((4 - 1 + 1) * Math.random() + 1);
        return new Card(f, s);
    }

    public void setCard(String f, String s){
        f = f.toLowerCase().substring(0,1);
        s = s.toLowerCase().substring(0,1);

        if (s.equals("s")){
            suit = 1;
        } else if (s.equals("c")){
            suit = 2;
        } else if (s.equals("d")){
          suit = 3;  
        } else{
            suit = 4;
        }

        if (f.equals("a")){
            face = 1;
        } else if (f.equals("j")){
            face = 11;
        } else if (f.equals("q")){
            face = 12;
        } else if (f.equals("k")){
            face = 13;
        } else{
            face = new Integer(f);
        }
    }

    public String getFace(){
        if (face == 1){
            return "ACE";
        } else if (face >= 2 && face <= 10){
            return "" + face;
        } else if (face == 11){
            return "JACK";
        } else if (face== 12){
            return "QUEEN";
        } else{
            return "KING";
        }
    }

    public String getSuit() {
        if (suit == 1){
            return "SPADES";
        } else if (suit == 2){
            return "CLUBS";
        } else if (suit == 3){
            return "DIAMONDS";
        } else{
            return "KING";
        }
    }

    public String toString(){
        return face + " of " + getSuit();
    }

    public boolean equals(Object o){
        Card c = (Card) (o);

        if (c.face == face && c.suit == suit){
            return true;
        } else{
            return false;
        }
    }
}