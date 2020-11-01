package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practise {
   public static void main(String[] args) {
       try {
        File file = new File("C:\\Users\\HP\\Desktop\\hello.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bfr = new BufferedReader(isr);
        
        Scanner scan = new Scanner(bfr);
        while(scan.hasNextLine()) {
            
        System.out.println(scan.nextLine());
        
        }
        
        scan.close();
        fis.close();
        bfr.close();
        isr.close();
       } catch(Exception e) {
           e.printStackTrace();
       }
   }
}