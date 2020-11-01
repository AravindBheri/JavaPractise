import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader3000 {
    public static void main(String[] args) throws FileNotFoundException {
       File file = new File("C:\\Users\\HP\\Desktop\\hello.txt");
       Scanner scan = new Scanner(file);
       while(scan.hasNextLine()) {
        System.out.println(scan.nextLine());
       }
        scan.close();
   } 
}