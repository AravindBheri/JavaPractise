package AbstractMethods;

abstract class Dog {

    public void bark() {
      System.out.println("Bark!");
    }
    public void poop() {
      System.out.println("Pooped!");
    }
}
class cat extends Dog {}
/**
 * Abstract
 */
public class Abstract {
    public static void main(String[] args) {
        
      cat c = new cat();
      c.bark();
      c.poop();
      
    }
}