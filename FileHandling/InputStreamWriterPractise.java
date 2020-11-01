package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class InputStreamWriterPractise {
    public static void main(String[] args) throws FileNotFoundException {
      try {
        File file = new File("Output3.txt");
        FileOutputStream fis = new FileOutputStream(file);
        OutputStreamWriter osr = new OutputStreamWriter(fis);
        
        osr.write("hey,it's me java bot");
        osr.close();
        fis.close();
      } 
      catch(Exception e) {
        e.printStackTrace();
      }

   }
}