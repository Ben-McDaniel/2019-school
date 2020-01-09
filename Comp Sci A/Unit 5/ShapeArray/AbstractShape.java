//Mr. Mosier's abstract shape class
public abstract class AbstractShape implements Shape{
    private int x;
    private int y;
    
    //constructor initializes x and y
    public AbstractShape(int inX, int inY) {
        this.moveTo(inX, inY);
    }
    
    //post: moves the object to a new x and y location
    public void moveTo(int inX, int inY) {
        x = inX;
        y = inY;
    }
    
    //moves the shape to a random X, Y location each between 0 and 1000 inclusive
    public void moveToRandom() {
        x = (int)(1001 * Math.random());
        y = (int)(1001 * Math.random());
    }
    
    //location of the shape has been return in X,Y format
    public String getPosition() {
        return x + ", " + y;
    }
    
    //Post: area of the shape has been returned
    public abstract double getArea();
    
    //Post: perimeter of the shape has been returned
    public abstract double getPerimeter();
    
    //Post: the type of shape has been returned (i.e. circle, square, rectangle, etc.)
    public abstract String getType();
    
    //return useful data about the shape object
    public String toString() {
        return "Type: " + getType() + " Position: " + getPosition() + " Perimeter: " + getPerimeter() + " Area: " + getArea();
    }
}