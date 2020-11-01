package FileHandling;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * BufferedOutputStream
 */
public class BufferedOutputStreamPractise {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Output1.txt");
            BufferedOutputStream bfOutputStream = new BufferedOutputStream(fos);

            String text = "Hey,this is a java noob";
            byte[] textInBytes = text.getBytes();
            bfOutputStream.write(textInBytes);
           
            bfOutputStream.close();
            fos.close();
            } 
           catch(Exception e) {
            e.printStackTrace();
           }
    
    }
}