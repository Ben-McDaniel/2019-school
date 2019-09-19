public class Square extends Rectangle { 
    //Constructors a Square at coordinate location inX, inY with length of l
    public Square(int inX, int inY, int l) {
        super(inX, inY, l, l);
    }
    
    //returns "Square" as the type of shape
    public String getType() {
        return "Square";
    }
}