package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
   public static void main(String[] args) {
      try {
        FileWriter myWriter = new FileWriter("C:\\Users\\HP\\Documents\\FileF1.txt");
        myWriter.write("This is the File written using JAVA");
        myWriter.close();
        System.out.println("Successfully wrote to the file");
      } 
      catch(IOException e) {
          System.out.println("An error occured");
          e.printStackTrace();
      }
   }
}