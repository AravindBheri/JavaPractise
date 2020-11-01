package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStreamPractise {
    public static void main(String[] args) throws IOException {
    try {
        File file = new File("C:\\Users\\HP\\Documents\\Output.txt");
        FileOutputStream outputStream = new FileOutputStream(file);

        String text = "JAVA is Fun";
        byte[] textInBytes = text.getBytes();

        outputStream.write(textInBytes);;

        outputStream.close();
     
    }   
    catch(Exception e) {
        e.printStackTrace();
    }
        
        
    }
}