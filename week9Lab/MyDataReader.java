package week9Lab;

/**
 * 
 * Reads text from a character-input stream, buffering characters to
 * provide for the efficient reading of characters, arrays, and lines.
 * 
 * Buffer size may be specified. The defualt is large enough for most purposes.
 * 
 * @see https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html
 */
import java.io.BufferedReader;
import java.io.FileReader; //Reads character files.FileReader is meant for reading streams of characters. As long as appropriate default byte-buffer size
import java.io.IOException; //Signals that an I/O exception of some sort has occurred.
import java.util.ArrayList;

public class MyDataReader {

    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<>();

        String filePath = "week9Lab/my_data.txt";
        int countRead = 0;

        try {
            try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {
                
                String line;
                boolean done = false;
                while (!done) {
                    line = br.readLine();
                    if(line == null) {
                        done = true;
                    }
                    else {
                        dataList.add(line);
                        countRead++;
                        
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error in reading file: " + e.getMessage());
            return;

        }

        

        System.out.println("Total Lines Read: " + countRead);
        System.out.println("--- Row Data ---");
        for(String l : dataList){
            System.out.println(l);
        }

       
        for(int i = 0; i < dataList.size(); i++) {
            String lines = dataList.get(i);
            
            int numberCount = 0;

            boolean withinNumber = false;
            
            for(char c : lines.toCharArray()) {
                if(Character.isDigit(c)) {
                    if (!withinNumber) {
                        ++numberCount;
                        withinNumber = true;
                    }
                } else {
                    withinNumber = false;
                }
            } 
            if (numberCount > 0) {
                System.out.println("line: " + (i + 1) + " has " + numberCount + " number(s)");
            }
        }



    }
}