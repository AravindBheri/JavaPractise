package FileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class InputStreamReaderPractise  {
    public static void main(String[] args) throws FileNotFoundException {
       try {
            FileInputStream file = new FileInputStream("Output.txt");
            InputStreamReader isr = new InputStreamReader(file);
     
            int i;
            char c;
            while((i = isr.read()) != -1) {
            c = (char)i;
            System.out.print(c);
            }
            isr.close();
            file.close();   
        } 
        catch(Exception e) {
            e.printStackTrace();
        }
     }
}
