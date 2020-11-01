package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class BufferedWriterPractise {
   public static void main(String[] args) {
    try {
        File file = new File("Output2.txt");
        FileOutputStream fis = new FileOutputStream(file);
        OutputStreamWriter osr = new OutputStreamWriter(fis);
        BufferedWriter bfw = new BufferedWriter(osr);

        bfw.write("hello,i'm a bot");
        bfw.close();
        osr.close();
        fis.close();
      } 
      catch(Exception e) {
        e.printStackTrace();
      }

   }
}