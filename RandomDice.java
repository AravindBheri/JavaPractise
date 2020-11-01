import java.util.Random;

/**
 * RandomDice
 */
public class RandomDice {

    public static void main(String[] args) {
        
    Random coolNumber = new Random();
    int x = coolNumber.nextInt(6) + 1;

    System.out.println(x);

    }

}