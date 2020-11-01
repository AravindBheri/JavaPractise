package Encapsulation;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
    Student s = new Student();
    s.setName("Aravind");
    s.setAge(19);

    System.out.println(s.getName());
    System.err.println(s.getAge());

    }

}