//Designed by Mr. Mosier for Principles of Java GT
//February 1, 2018
//For general student use including projects!
public class Rectangle {
    private int length;
    private int width;
    private Point location;
    
    public Rectangle() {
        length = 1;
        width = 1;
        location = new Point(0, 0);
    }
    
    public Rectangle(int l, int w) {
        length = l;
        width = w;
        location = new Point(0, 0);
    }
    
    public Rectangle(int inX, int inY, int l, int w) {
        length = l;
        width = w;
        location = new Point(inX, inY);
    }
    
    public void doubleSize() {
        length = length * 2;
        width = width * 2;
    }
    
    public void move(int newX, int newY) {
        location.setX(newX);
        location.setY(newY);
    }
    
    public int getLength() {
        return length;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getArea() {
        return length * width;
    }
    
    public int getPerimeter() {
        return 2 * length + 2 * width;
    }
    
    public String getLocation() {
        return location.toString();
    }
    
    public String getAreaFormula() {
        return "length X width";
    }
    
    public boolean equals(Object o) {
        Rectangle r = (Rectangle) o;
        if (r.length == length && r.width == width) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        return "Length = " + length + "\n" +
                "Width = " + width;
    }
}