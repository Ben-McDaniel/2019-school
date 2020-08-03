//Designed and Written by Mr. Mosier
//Written for Principles of Java Programming course
import java.util.Random;
public class Coin {
    private int face; //1 = heads, 2 = tails
    private String type;
    
    public Coin() {
        flip();
        type = "Quarter";
    }
    
    public Coin(int inFace) {
        setFace(inFace);
        type = "Quarter";
    }
    
    public Coin(String inFace) {
        setFace(inFace);
        type = "Quarter";
    }
    
    public Coin(String inType, String inFace) {
        setFace(inFace);
        type = inType;
    }
    
    public Coin(String inType, int inFace) {
        setFace(inFace);
        type = inType;
    }
    
    public void flip() {
        Random r = new Random();
        face = r.nextInt(2) + 1;
    }
    
    public void setFace(int inFace) {
        face = inFace;
    }
    
    //Precondition: inFace must be either "heads" or "tails"
    public void setFace(String inFace) {
        inFace = inFace.substring(0,1).toLowerCase();
        if (inFace.equals("h")) {
            face = 1;
        } else {
            face = 2;
        }
    }
    
    public String getFace() {
        if (face == 1) {
            return "Heads";
        } else {
            return "Tails";
        }
    }
    
    public String toString() {
        return "Coin type = " + type + " Side = " + face;
    }
    
    public boolean equals(Object o) {
        Coin c = (Coin) o;
        if (type.equals(c.type) && face == c.face) {
            return true;
        }
        return false;
    }
    
}