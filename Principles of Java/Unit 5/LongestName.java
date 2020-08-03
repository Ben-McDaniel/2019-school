import java.util.*;

public class LongestName {
        public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String in = "";
        String longest = "";


        do {
            System.out.println("Enter a name or 'Done' to stop adding names");
            in = input.next();
            if (!in.toLowerCase().equals("done")){
                names.add(in);
            }
        } while(!in.toLowerCase().equals("done") && names.size() <= 1000);

        longest = names.get(0);

        for (int i = 1; i < names.size(); i++){
            if (names.get(i).length() > longest.length()){
                longest = names.get(i);
            }
        }

        System.out.println("The longest name is: " + longest);
    }
}