//Ben McDaniel

public class DeckOfCardsTester{
    public static void main(String[]args){
        DeckOfCards Deck = new DeckOfCards();
        Deck.shuffle();

        for (int i = 0; i < 51; i++){
            System.out.println(Deck.dealCard());
        }
    }
}