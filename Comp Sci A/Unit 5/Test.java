public class Test{
    public static void main(String[]args){
        int x = 0;
        int counter = 1;

        do{
            x=x+2;
            System.out.println(counter);
            counter++;
        }while(x < 120);
    }
}