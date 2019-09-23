public class Rectangle extends AbstractShape {
    private double length;
    private double width;
    
    //Constructs a Rectangle object at coordinate location inX, inY with a length of l and width of w
    public Rectangle(int inX, int inY, int l, int w) {
        super(inX, inY);
        length = l;
        width = w;
    }
    
    //returns the area of the rectangle
    public double getArea() {
        return length * width;
    }
    
    //returns the perimeter of the rectangle
    public double getPerimeter() {
        return length * 2 + width * 2;
    }
    
    //returns "Rectangle" as the type of shape
    public String getType() {
        return "Rectangle";
    }
}