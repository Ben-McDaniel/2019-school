import java.util.Arrays;

public class challenge2 {
    public static void main(String[]args){
        int[] pegs = new int[]{4, 30, 50};
        System.out.println(Arrays.toString(solution(pegs)));
    }

    
    public static int[] solution(int[] pegs) {
        // Your code here
        int [] noSolution = {-1, -1};
        int maxSize, size, finalGear = 0;

        maxSize = pegs[1] - pegs[0] -1;

        for (int i = 1; i <= maxSize; i++){
            //go through whole array figuring out what size the final gear will be
            size = i;
            for (int j = 1; j < pegs.length; j++){
                size = nextGearSize(pegs, j, size);
                finalGear = size;
            }
            finalGear = (finalGear - 1) / 2;
            System.out.println(finalGear);

            if (i / finalGear == 2){
                int[] solution = {i, 1};
                return solution;
            }
        }
        return noSolution;
    }

    public static int nextGearSize(int[] pegs, int pos, int previousSize){
        int size = pegs[pos] - pegs[pos - 1] - 1;
        System.out.println(size);
        return size;
    }
}