package FileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderRFun {
   public static void main(String[] args) {
      try {
         FileInputStream file = new FileInputStream("Output.txt");
         InputStreamReader isr = new InputStreamReader(file);
         BufferedReader bfr = new BufferedReader(isr);
         
         String thisLine;
         while((thisLine = bfr.readLine()) != null) {
             System.out.println(thisLine);
         }
         isr.close();
         file.close();
         bfr.close();   
     } 
     catch(Exception e) {
         e.printStackTrace();
     }
}

}
