package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFromFile {
     public static void main(String[] args) {
         try {
             FileReader myObj = new FileReader("C:\\Users\\HP\\Documents\\FileF1.txt");
             Scanner myReader = new Scanner(myObj);
             while(myReader.hasNextLine()) {
                 String data = myReader.nextLine();
                 System.out.println(data);
             }
             myReader.close();
         }
         catch(FileNotFoundException e) {
             System.err.println("File Not Found");
             e.printStackTrace();
         }
     }
}