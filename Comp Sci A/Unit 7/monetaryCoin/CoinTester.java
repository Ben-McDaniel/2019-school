//Ben McDaniel

public class CoinTester{
    public static void main(String[]args){
        int total;
        MonetaryCoin c1 = new MonetaryCoin(5);
        MonetaryCoin c2 = new MonetaryCoin(11);
        MonetaryCoin c3 = new MonetaryCoin(43); 


        total = c1.returnValue() + c2.returnValue() + c3.returnValue();
        System.out.println("Sum: " + total);

        System.out.println("Value of first coin: " + c1.returnValue());
        System.out.println(c1.toString());
        c1.flip();
        System.out.println(c1.toString());

    }
}