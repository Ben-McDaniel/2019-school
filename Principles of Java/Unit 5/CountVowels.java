import java.util.*;

public class CountVowels{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String in = "";
        int totalVowels = 0;

        do {
            System.out.println("Enter a name or 'Done' to stop adding names");
            in = input.next();
            if (!in.toLowerCase().equals("done")){
                names.add(in);
            }
        } while(!in.toLowerCase().equals("done") && names.size() <= 1000);

        for(int i = 0; i < names.size(); i++){
            String name = names.get(i);
            for(int j = 0; j < name.length();j++){
                String letter = name.substring(j, j+1);
                if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")){
                    totalVowels++;
                }
            }
        }

        System.out.println("The names have a total of " + totalVowels + " vowels in them");
    }
}