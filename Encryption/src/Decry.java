package Encryption.src;

public class Decry {
    
    public static void main(String[] args) throws Exception {

        int key = 6;

        String text = "Yzgxz&znk&Gzzgiq'";

        System.out.println(text);

        char[] chars = text.toCharArray();

        for (char c : chars) {

            c -= key;
            System.out.print(c);

        }
    }
}
