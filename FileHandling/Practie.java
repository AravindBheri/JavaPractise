package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Practie {
  public static void main(String[] args) {
    try {

        Scanner scan = new Scanner(System.in);
        System.err.println("Please enter some Text");
        String text = scan.nextLine();
        System.out.println("Please enter a file name");
        String fileName = scan.nextLine();
        scan.close();

        new File("fileName");
        FileOutputStream outputStream = new FileOutputStream(fileName);

        
        byte[] textInBytes = text.getBytes();

        outputStream.write(textInBytes);;

        outputStream.close();
        System.out.println("Saved");
    }   
    catch(Exception e) {
        e.printStackTrace();
    }
   
  }
}