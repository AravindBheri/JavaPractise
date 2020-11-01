package FileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ByteArrayOutputStreamRFun
 */
public class ByteArrayOutputStreamRFun {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        FileOutputStream f1 = new FileOutputStream("C:\\Users\\Hp\\Desktop\\f1.txt");
        

        String data = "Files are Done!";
        byte text[] = data.getBytes();
        baos.write(text);
        baos.writeTo(f1);
        baos.close();
        
    }
}