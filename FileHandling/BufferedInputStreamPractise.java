package FileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamPractise {
    public static void main(String[] args) throws FileNotFoundException {
       try {
        FileInputStream fis = new FileInputStream("Output.txt");
        BufferedInputStream bfInputStream = new BufferedInputStream(fis);

        int i;
        char c;

        while((i = bfInputStream.read()) != -1) {
            c = (char)i;
            System.err.print(c);
        }
          fis.close();
          bfInputStream.close();   
       } 
       catch(Exception e) {
        e.printStackTrace();
       }

 }
}