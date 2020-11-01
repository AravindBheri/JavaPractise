package CollectionsRFun;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ListPractise
 */
public class ListPractise {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Aravind");
        list1.add("Bheri");
        list1.add("Aravind");

        System.out.println("List 1 is: " + list1);
        
        String name = list1.get(1);
        System.out.println(name);

        list1.set(1, "bheri");
        System.out.println("List1 now is: " + list1);

        if(list1.contains("bheri")) {
            System.out.println("bheri is in the List");
        }

        for(int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for(String str : list1) {
            System.out.println(str);
        }
        Iterator<String> itr = list1.iterator();
        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Aravind")) {
                itr.remove();
            }
        }

        System.out.println(list1);
        


    }
}