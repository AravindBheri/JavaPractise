/**
 * Mobile
 */
public class Mobile {

    String color = "Black";
    String[] functions = {"Play", "Music", "Read" };
    
    static Boolean power = true;
    static int volume = 0;

    public static void powerOn() {
        power = true;
    } 

    public static void powerOff() {
        power = false;
    }

    public static void volumeUp() {
        volume++;
    }

    public static void volumeDown() {
        volume--;
    }

}