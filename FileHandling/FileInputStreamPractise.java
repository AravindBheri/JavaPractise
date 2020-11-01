package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStreamPractise
 */
public class FileInputStreamPractise {

    public static void main(String[] args) throws IOException {
         
       FileInputStream inputStream = new FileInputStream("C:\\Users\\HP\\Documents\\FileF1.txt");
       
       int i;
       char c;

       while((i = inputStream.read()) != -1) { 
           c = (char)i;      
           System.out.print(c);
         }
         inputStream.close();
    }  

}