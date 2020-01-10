import java.util.Scanner;

public class test{
    public static void main(String[]args){
        Scanner s = new Scanner( System.in );
        
        while (true)
            System.out.println(solution(s.nextLine()));
        // System.out.println(bsolution("abcabcabc"));
    }

    public static String repeat( String s, int r ) {
        String toReturn = s;
        for ( int i = 1; i < r; i++ ) {
            toReturn = toReturn + s;
        }
        return toReturn;
    }    
    public static int solution(String x){
        double subLen;
        int reps;
        for ( int i = 1; i < x.length(); i++ ) {
            subLen = x.substring(0, i).length();
            if ( subLen % 1 == 0.0 ) {
                reps = x.length() / (int) subLen;
                // System.out.println(repeat( x.substring(0, i), reps ));
                if ( repeat( x.substring(0, i), reps ).equalsIgnoreCase( x )) {
                    //System.out.println( "Found pattern: " + x.substring(0, i) + ", repeated x" + reps); // Debug print
                    return reps;
                }
            }
        }

        return 1; // no pattern found
    }
    // public static int bsolution(String x){
    //     int repetitions = 0;
    //     String pattern = findPattern(x);

    //     for (int i = 0; i < .5 * x.length(); i++){
    //         findPattern(pattern);
    //     }
        
    //     repetitions = x.length() / pattern.length();
    //     return repetitions;
    // }

    // public static String findPattern(String x) {
    //     int  length = x.length();
    //     String pattern = "";
    //     for (int i = 1; i <= .5 * length; i++){
    //         if (length % i == 0){
    //             pattern = x.substring(0, i);
    //             if (pattern.equalsIgnoreCase(x.substring(pattern.length(), 2 * pattern.length()))){
    //                 return pattern;
    //             }
    //         }
    //     }
    //     return pattern;
    // }
    
}