public class test{
    public static void main(String[]args){
        String x = "abcabcaabcabca";
        int repetitions, length = x.length();
        String pattern = ""; 
        boolean check = true;
        
        for (int i = 1; i < .5 * length; i++){
            check = true;
            pattern = x.substring(0, i);
            if (pattern.equalsIgnoreCase(x.substring(i, i + pattern.length()))){
                while(check){
                    for (int j = 0; j < length / pattern.length();) {
                        System.out.println("hello");
                        if (pattern.equalsIgnoreCase(x.substring(pattern.length() + j * pattern.length(), 2 * pattern.length() + j * pattern.length()))){
                            System.out.println(j);
                        }else{
                            break;
                        }
                        break;
                    }
                check = false;
                }
            }
        }
    }
}