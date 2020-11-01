package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewFileXD {
    public static void main(String[] args) throws IOException {
           File file = new File("C:\\Users\\HP\\Desktop\\hello.txt");
           Scanner scan = new Scanner(file);
           
           

           String data = "";
           while(scan.hasNextLine()) {
               data = data.concat(scan.nextLine() + "\n");
           }
           scan.close();
           FileWriter fw = new FileWriter("C:\\Users\\HP\\Desktop\\hello1.txt");
           fw.write(data);
           fw.close();
           
       }
}