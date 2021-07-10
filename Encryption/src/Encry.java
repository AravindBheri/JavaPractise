package Encryption.src;

public class Encry {
    
    public static void main(String[] args) throws Exception {

        int key = 6;

        String text = "Start the Attack!";

        System.out.println(text);

        char[] chars = text.toCharArray();

        for (char c : chars) {

            c += key;
            System.out.print(c);

        }
    }
}
