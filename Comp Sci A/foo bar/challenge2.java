import java.util.Arrays;

public class challenge2 {
    public static void main(String[]args){
        int[] pegs = new int[]{4, 30, 50};
        System.out.println(Arrays.toString(solution(pegs)));
    }

    public static int[] solution(int[] pegs) {
        // Your code here
        int [] noSolution = {-1, -1};
        int maxSize, minSize, finalGear;

        maxSize = pegs[1] - pegs[0] -1;
        System.out.println(maxSize);








        return noSolution;
    }
}