public class Main {
     
    public static void main(String[] args) {
        
        MyGenericsClass<Integer, Double> myInt = new MyGenericsClass<>(1, 2.0);
        MyGenericsClass<Double, Integer> myDouble = new MyGenericsClass<>(1.0, 2);
        MyGenericsClass<Character, String> myChar = new MyGenericsClass<>('a', "b");
        MyGenericsClass<String, Character> myString = new MyGenericsClass<>("A", 'B');

        System.out.println(myInt.getValue());
        System.out.println(myInt.getValue2());
        System.out.println(myDouble.getValue());
        System.out.println(myDouble.getValue2());
        System.out.println(myChar.getValue());
        System.out.println(myChar.getValue2());
        System.out.println(myString.getValue());
        System.out.println(myString.getValue2());
    }
}
