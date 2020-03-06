public class B extends A{
    private int b;
    
    public B(int a, int b){
        super(a);
        this.b = b;
    }

    public int method2(){
        return a + method3();
    }

    public int method3(){
        return b;
    }

    public int method5(){
        return b + super.method1();
    }
}