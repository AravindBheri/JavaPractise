/**
 * Palindromes
 */
public class Palindromes {

    public static void main(String[] args) {
        
     String original = "race car";
     original = original.replace(" ", "");

     String reverse = "";

     for(int i = original.length(); i >= 0; i--) {
         reverse += original.charAt(i);
         System.out.println(reverse);
     }
      
     boolean Palindrome = true;

     for(int i = 0; i < original.length(); i++) {
     if(original.charAt(i) != reverse.charAt(i)) {
       Palindrome = false;
     } 

    }
     if(Palindrome) {
        System.out.println("PALINDROME");
     }
     else {
         System.out.println("not a PALINDROME");
     }
     
    }
}