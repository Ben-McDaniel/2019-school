import java.lang.*;

public class Die{

    private int face = 0;
    public Die (){
        face = 0;
    }

    public int roll(){
        face = (int) ((Math.random() * ((6 - 1) + 1)) + 1);
        return face;
    }
}