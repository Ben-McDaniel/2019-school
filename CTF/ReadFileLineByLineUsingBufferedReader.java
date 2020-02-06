import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLineUsingBufferedReader {

	public static void main(String[] args) {
        int numZ = 0; 
        int numO = 0;
        int lineCount = 0;

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("/Users/benbo/OneDrive/Desktop/2019-school/CTF/data.dat"));
			String line = reader.readLine();
			while (line != null) {
                System.out.println(line);
                //Calculate
                for (int i=0; i < line.length(); i++){
                    if (line.charAt(i) == '0'){
                        numZ++;
                    } else{
                        numO++;
                    }
                }

                if (numZ % 3 == 0 || numO % 2 == 0){
                    lineCount++;
                }


				// read next line
                line = reader.readLine();
                numZ = 0;
                numO = 0;
            }
            System.out.println(lineCount);

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}