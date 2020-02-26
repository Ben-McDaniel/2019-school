//Point class designed by Mr. Mosier for Principles of Java GT
//February 8, 2018
//Representes a 2-dimensional point object
//For general student use including projects!
public class Point {
    private int x;
    private int y;
    
    //Default constructor
    public Point() {
        x = 0;
        y = 0;
    }
    
    //Constructor accepts x and y
    public Point(int inX, int inY) {
        x = inX;
        y = inY;
    }
    
    //Pre: x is a valid X location
    public void setX(int inX) {
        x = inX;
    }
    
    //Pre: y is a valid y location
    public void setY(int inY) {
        y = inY;
    }
    
    //returns x value
    public int getX() {
        return x;
    }
    
    //returns y value
    public int getY() {
        return y;
    }

    //returns true if both Point objects contains the same x and y
    public boolean equals(Object o) {
        Point p = (Point) o;
        if (p.x == x && p.y == y) {
            return true;
        } else {
            return false;
        }
    }

    //returns x and y in String format
    public String toString() {
        return x + ", " + y;
    }
}