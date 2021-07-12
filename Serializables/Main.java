import java.io.*;

public class Main implements Serializable {

    public static void main(String[] args) throws IOException  {
        
        Userd user = new Userd();

        user.username = "Aravind";
        user.password = "Arvind emrit";

        FileOutputStream fileOut = new FileOutputStream("userinfo.ser");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(user);
        objOut.close();
        fileOut.close();

        System.out.println("Done! :)");
        user.sayHello();
    }
}