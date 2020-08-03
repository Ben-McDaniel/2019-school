import java.util.*;

public class AvgLength {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String in = "";
        int sum = 0;
        double avg = 0;


        do {
            System.out.println("Enter a name or 'Done' to stop adding names");
            in = input.next();
            if (!in.toLowerCase().equals("done")){
                names.add(in);
            }
        } while(!in.toLowerCase().equals("done") && names.size() <= 1000);

        for (int i = 0; i < names.size(); i++){
            sum+= names.get(i).length();
        }

        avg = sum / names.size();

        System.out.println("There average length is: " + avg);

    }
}