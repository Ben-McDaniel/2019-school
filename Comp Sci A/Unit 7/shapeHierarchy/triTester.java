public class triTester{
    public static void main(String[]args){
        Triangle t = new Triangle(4, 2, 0, 0, 3, 0, 3, 4);
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimiter:" + t.getPerimeter());
        t.moveToRandom();
        System.out.println("New Position: " + t.getPosition());
    }
}