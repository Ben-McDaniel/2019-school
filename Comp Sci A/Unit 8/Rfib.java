public class Rfib{
    public Rfib(){
    }

    public int solve(int n){
        if ((n == 0) || (n == 1)){
            return n;
        } else{
            return solve(n - 1) + solve(n - 2);
        }
    }
}