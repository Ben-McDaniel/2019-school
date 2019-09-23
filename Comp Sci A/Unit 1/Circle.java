public class Circle extends AbstractShape {
    private double radius;
    
    //Constructs a new Circle at coordinate location inX, inY with a radius of r
    public Circle(int inX, int inY, int r) {
        super(inX, inY);
        radius = r;
    }
    
    //returns the area of the circle
    public double getArea() {
        return 3.14 * radius * radius;
    }
    
    //returns the perimeter of the circle
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
    
    //returns the perimeter of the circle
    public double getCircumference() {
        return getPerimeter();
    }
    
    //returns "Circle" as the type of shape
    public String getType() {
        return "Circle";
    }
}