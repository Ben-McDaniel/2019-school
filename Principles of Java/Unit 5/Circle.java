//Circle class designed by Mr. Mosier for Principles of Java GT
//February 1, 2018
//For general student use including projects!
public class Circle {
    private double PI;
    private double radius;
    private Point location;

    public Circle() {
        PI = 3.14;
        radius = 1.0;
        location = new Point(0, 0);
    }
    
    public Circle(double newRadius) {
        PI = 3.14;
        radius = newRadius;
        location = new Point(0, 0);
    }
    
    public Circle(int x, int y, double newRadius) {
        PI = 3.14;
        radius = newRadius;
        location = new Point(x, y);
    }
    
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    
    public void move(int newX, int newY) {
        location.setX(newX);
        location.setY(newY);
    }
    
    public double getArea() {
        return PI * radius * radius;
    }
    
    public double getCircumference() {
        return 2 * PI * radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public String getLocation() {
        return location.toString();
    }
    
    public String toString() {
        return "PI = " + PI + " radius = " + radius;
    }
    
    public boolean equals(Object o) {
        Circle c = (Circle) o;
        if (radius == c.radius) {
            return true;
        } else {
            return false;
        }
    }
}
