public class weruweioru {
    public static boolean wordChecker(String firstLetter, int maxLength, int n){
        private int con = 0;

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < n; i++){
            words.add(getWord);
        }

        for (int i = 0; i < n; i++){
            if (words[i].charAt(0) == firstLetter && words[i].length() < maxLength){
                con++;
            }

            if ((n / 10) > con){
                return true;
            } else{
                return false;
            }

        }

        /** to make thius change you would just need to add one extra parameter to the wordchecker class for the percentage, it would be a double, 
         * representing the percentage you wanted to test.  It would be stored as a private int and to calculate the percentage, you would have to 
         * cast the result of dividing int n, by double percentage to an int.  this would allow you to most closely get the percentage of words out of
         * how many were generated, without any errors when comparing two data types 
         */
    }
}