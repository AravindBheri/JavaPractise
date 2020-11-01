/**
 * MobileUsage
 */
public class MobileUsage {

    public static void main(String[] args) {
        
        Mobile m = new Mobile();
        
        System.out.println(m.color);
        
        System.out.println(m.functions[1]);
        
        System.out.println(Mobile.power);
        Mobile.powerOff();
        System.out.println(Mobile.power);
    }

}