public abstract class A{
    private int a;

    public A(int a){
        this.a = a;
    }

    public int method1(){
        return a;
    }

    public abstract int method2();
}