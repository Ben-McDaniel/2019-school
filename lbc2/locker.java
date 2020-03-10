public class locker{
    public static void main(String[]args){
        int x = 4;

        for (int i = 0; i < 13; i++){
            x = x/2;
            x += 6;
            x = x*4;
            x -= 8;
        }

        System.out.println(x);
    }
}