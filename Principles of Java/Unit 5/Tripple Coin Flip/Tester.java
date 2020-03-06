//Ben McDaniel
public class Tester{
    public static void main(String[]args){
        Coin c1 = new Coin();
        Coin c2 = new Coin();
        Coin c3 = new Coin();
        int nh = 0;
        int oh = 0;
        int dh = 0;
        int th = 0;

        for (int i = 0; i < 10000; i++){
            c1.flip();
            c2.flip();
            c3.flip();

            if(c1.getFace().equals("Heads") || c2.getFace().equals("Heads") || c3.getFace().equals("Heads")){
                if (c1.getFace().equals("Heads") && c2.getFace().equals("Heads") && c3.getFace().equals("Heads")){
                    th++;
                } else if(c1.getFace().equals("Heads") && c2.getFace().equals("Heads") || c2.getFace().equals("Heads") && c3.getFace().equals("Heads") || c1.getFace().equals("Heads") && c3.getFace().equals("Heads")){
                    dh++;
                } else {
                    oh++;
                }
            } else{
                nh++;
            }
        }

        System.out.println("Nil-Heads: " + nh);
        System.out.println("Single Heads: " + oh);
        System.out.println("Double Heads: " + dh);
        System.out.println("Tripple Heads: " + th);
    }
}