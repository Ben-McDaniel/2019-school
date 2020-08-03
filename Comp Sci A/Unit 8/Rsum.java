public class Rsum{
    private int total = 0;
    public int rSum(int num, int sum){
        if (num == 0){
            return sum;
        }

        sum += num;
        return rSum(num - 1, sum);
    }
}