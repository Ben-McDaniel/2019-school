public class Triangle extends AbstractShape{
    private int x1, y1, x2, y2, x3, y3;
    private double s = 0;

    public Triangle(int inX, int inY, int px1, int py1, int px2, int py2, int px3, int py3) {
        super(inX, inY);
        x1 = px1;
        y1 = py1;
        x2 = px2;
        y2 = py2;
        x3 = px3;
        y3 = py3;
    }

    public double getArea() {
        s = this.getPerimeter();
        return((x1 * (y2 -y3) + x2 * (y3 -y1) + x3 * (y1 - y2)) / 2);
    }

    public double getPerimeter() {
        return(this.distance(x1, x2, y1, y2) + this.distance(x2, x3, y2, y3) + this.distance(x1, x3, y1, y3));
    }

    public String getType() {

        return "Triangle";
    }

    public double distance(int x1, int x2, int y1, int y2){
        return(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
    }

}