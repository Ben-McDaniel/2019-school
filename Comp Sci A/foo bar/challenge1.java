public class challenge1{
    public static void main(String[]args){
        String x = "abcabcabcabc";
        int repetitions = 0, length = x.length();
        String pattern = ""; 
        
        for (int i = 1; i <= .5 * length; i++){
            if (length % i == 0){
                pattern = x.substring(0, i);
                if (pattern.equalsIgnoreCase(x.substring(pattern.length(), 2 * pattern.length()))){
                    if(){
                        repetitions = length / pattern.length();
                    }
                }
            }
        }

        for (int j = 2; j <= .5 * pattern.length(); j++){
            if (pattern.length() % j != 0){

            } else if (pattern.substring(0, pattern.length() / j + 1).equalsIgnoreCase(pattern.substring(pattern.length() / j, pattern.length() / j + j))){
                String temp = pattern.substring(0, pattern.length() / j);
                System.out.println(temp);
            }
        }





        System.out.println(repetitions);
    }
}