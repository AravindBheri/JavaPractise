/**
 * Account
 */
public class Account {

    String name;
    int age;
     
    public static void main(String[] args) {
        
        Account a = new Account();
        a.name = "Aravind";
        a.age = 19;
        System.out.println(a.getName());
        System.out.println(a.getAge());

        }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
     }
}
