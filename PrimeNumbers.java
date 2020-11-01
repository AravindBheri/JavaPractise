import java.util.ArrayList;
/**
 * PrimeNumbers
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        
        findPrimes(1, 10);

    }

    public static ArrayList<Integer> findPrimes(int start, int end) {
    
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int n = start; n < end; n++ ) {

            boolean prime = true;
            int  i = 2;
            while(i <= n/2) {
                if(n % 2 == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                primes.add(n);
            }
        }
            return primes;
    }
}