//This is a class-based interface between the programmer USING the classes (YOU) and the programmer who MADE the classes (ME)
//It contains all of the common methods associated with all "shape" classes
public interface Shape {
	public void moveTo(int x, int y);
	public void moveToRandom();
	public double getArea();
	public double getPerimeter();
	public String getType();
	public String getPosition();
	public String toString();
}
