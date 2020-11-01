package FileHandling;

import java.io.File;

public class FileInformation {

    public static void main(String[] args) {
        
       File myObj = new File("C:\\Users\\HP\\Documents\\FileF1.txt");
       if(myObj.exists()) {

         System.out.println("file name:" + myObj.getName());
         System.out.println("Absolut path:" + myObj.getAbsolutePath());
         System.out.println("Writable:" + myObj.canRead());
         System.out.println("Readabla:" + myObj.canRead());
         System.out.println("Length of the size in bytes: " + myObj.length());
       } else {
           System.out.println("File does not exists.");
       }

    }
   
}