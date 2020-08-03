public class Tester{
    public static void main(String[]args){
        A thing1 = new B(1,2);
        B thing2 = new B(3,4);
        A thing3 = new C(5,6,7);
        B thing4 = new C(8,9,10);
        C thing5 = new C(11,12,13);

        System.out.println(thing1.method1());
    }
}