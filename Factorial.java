public class Factorial {
    public static void main(String[] args) {
        System.out.println(MyFactorial(5));
    }

    public static int MyFactorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * MyFactorial(n - 1);
        }
    }
    
}