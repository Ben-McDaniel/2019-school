
import java.uitl.*;

public class Coin {
    private final int HEADS = 0;
    private final int TAILS = 1;
    int status = 0;

    private int face;

    public Coin(){
        flip();
    }

    public void flip(){
        face = (int) (Math.random() * 2);
    }

    public boolean isHeads(){
        return(face == HEADS);
    }

    public String toString(){
        String faceName;
        if (face == HEADS){
            faceName = "Heads";
        }else{
            faceName = "Tails";
        }
        return faceName;
    }

    public void setKey(int k){
        int key = k;
    }

    public int lock(int k){
        if (k == key){

        }
    }

    public unlock(int k){

    }

    public static boolean locked(int k){

    }

}