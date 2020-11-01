package InterfacesRFun;

interface WaterBottleExample {
     String color = "blue";

     void fillUp();
     void pourDown();
     void run();
}
/**
 * InterfaceExample
 */
public class InterfaceExample implements WaterBottleExample{

    public static void main(String[] args) {
        
     System.out.println(color);
     
     InterfaceExample ex = new InterfaceExample();
     ex.fillUp();
     ex.pourDown();
     ex.run();
    }

    @Override
    public void fillUp() {

     System.out.println("It is Filled!");

    }

    @Override
    public void pourDown() {
        
        System.out.println("Empty Bottle!");

    }

    @Override
    public void run() {
        
        System.out.println("nothing");
    }

}