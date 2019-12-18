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
            
        }
    }
}