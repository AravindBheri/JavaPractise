package Enums;

/**
 * EnumsRFun
 */
public class EnumsRFun {

    enum Flavours {
        CHOCO, VANILLA, BERRY;
    }

    public static void main(String[] args) {
         
     Flavours f = Flavours.BERRY;

     switch(f) {
         case CHOCO: 
         System.out.println("It's CHOCOLATE");
         break;
         case VANILLA: 
         System.out.println("It's VANILLA");
         break;
         case BERRY: 
         System.out.println("It's BERRY");
         break;
     }

    }

}