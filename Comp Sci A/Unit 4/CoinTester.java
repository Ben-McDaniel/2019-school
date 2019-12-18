//Ben McDaniel

public class CoinTester{
    public static void main(String[]args){
        Coin c1 = new Coin();

        c1.setKey(829);
        System.out.println(c1.lock(1));
        System.out.println(c1.lock(829));

        c1.flip();
        c1.isHeads();
        c1.unlock(123);
        c1.unlock(829);
        c1.isHeads();
    }
}