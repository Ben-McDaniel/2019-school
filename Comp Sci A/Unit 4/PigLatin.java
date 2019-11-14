//Ben McDaniel

import java.util.*;

public class PigLatin{
    public static void main(String[]args){
        String sentence, result, another = "y";
        Scanner input = new Scanner(System.in);
        PigLatinTranslator translator = new PigLatinTranslator();

        while (another.equalsIgnoreCase("y")){
            System.out.println();
            System.out.println("Enter a Sentence (no punctuation) ");
            sentence = input.nextLine();

            System.out.println();
            result = translator.translate(sentence);
            System.out.println("That Sentence in pig latin is: ");
            System.out.println(result);

            System.out.println();
            System.out.println("Translate another sentence (y/n)");
            another = input.next();
        }
    }
}