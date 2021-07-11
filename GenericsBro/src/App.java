public class App {

    public static void main(String[] args) {
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.0, 2.0};
        Character[] charArray = {'a', 'r'};
        String[] stringArray = {"A", "R"};

        // displayArray(intArray);
        // displayArray(doubleArray);
        // displayArray(charArray);
        // displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));

    }

    // public static <Thing> void displayArray(Thing[] array) {

    //     for(Thing x : array) {

    //         System.out.print(x + " ");

    //     }

    //     System.out.println("");
    // } 

    public static <Thing> Thing getFirst(Thing[] array) {

        return array[0];

    }
}