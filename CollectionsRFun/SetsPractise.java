package CollectionsRFun;

import java.util.HashSet;
import java.util.Iterator;

public class SetsPractise {
      public static void main(String[] args) {
          HashSet<String> set = new HashSet<String>();

          set.add("Aravind");
          set.add("Bheri");
          set.add("Aravind");
          set.add("Andy");

          System.out.println("Set is : " + set);

          System.out.println("Size is : " + set.size());

          Iterator<String> itr = set.iterator();
          while(itr.hasNext()) {
              String str = itr.next();
              System.out.println(str);
          }

          System.out.println(set.isEmpty());
        
          

      }
}