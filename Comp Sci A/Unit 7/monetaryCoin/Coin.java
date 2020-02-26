
import java.util.*;

public class Coin{
    private final int HEADS = 0;
    private final int TAILS = 1; 
    private boolean status = true;
    private int key;

    private int face;

    public Coin(){
        if (status == true){
            flip();
        }   
    }

    public void flip(){
        if (status == true){
           face = (int) (Math.random() * 2);
        } 
    }

    public boolean isHeads(){
        if (status == true){
            return(face == HEADS);
        } else{
            System.out.println("Failed, method Locked");
            return(false);
        }
    }

    public String toString(){
        if (status == true){
            String faceName;
            if (face == HEADS){
                faceName = "Heads";
            }else{
                faceName = "Tails";
            }
            return faceName;
        } else {
            return("Failed, method Locked");
        }
        
    }


}
