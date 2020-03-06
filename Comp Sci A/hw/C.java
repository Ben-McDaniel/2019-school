public class C extends B{
    private int c;

    public C(int a, int b, int c){
        super(a, b);
        this.c = c;
    }

    public int method1(){
        return a + b + method2();
    }

    public int method3(){
        return c + super.method1();
    }

    public int method4(){
        return c + super.method5();
    }
}