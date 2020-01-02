//Ben McDaniel

public class DeckOfCards{
    private Card [] deck;
    private int topCard;

    public DeckOfCards(){
        deck = new Card[52];
        createDeck();
        topCard = 0;
    }

    private void createDeck(){
        int c = 0;
        for (int f = 1; f <= 13; f++){
            for (int s = 1; s <= 4; s++){
                deck [c] = new Card(f,s);
                c++;
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < 10000; i++){
            int a = (int)((51 - 0 + 1) * Math.random() + 0);
            int b = (int)((51 - 0 + 1) * Math.random() + 0);
            Card temp = deck [a];
            deck [a] = deck [b];
            deck [b] = temp;
        }
    }

    public Card dealCard(){
        if (topCard <= 51){
            topCard++;
            return deck [topCard];
        } else {
            return null;
        }
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < 52; i++){
            s = s + deck [i] + " ";
        }
        return s;
    }
}