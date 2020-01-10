import java.util.Arrays;

public class challenge2 {
    public static void main(String[]args){
        int[] pegs = new int[]{4, 30, 50};
        System.out.println(Arrays.toString(solution(pegs)));
    }

    
    public static int[] solution(int[] pegs) {
        // Your code here
        int [] noSolution = {-1, -1};
        int maxSize, finalGear = 0;

        maxSize = pegs[1] - pegs[0] -1;
        for (int i = 1; i <= maxSize; i++){
            //go through whole array figuring out what size the final gear will be
            for (int j = 1; j < pegs.length; j++){
                finalGear = pegs[j] - pegs[j-1] - i - j;
            }
            if (i / finalGear == 2){
                int[] solution = {i, 1};
                return solution;
            }
        }
        return noSolution;
    }
}