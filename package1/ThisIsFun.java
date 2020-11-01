package package1;

/**
 * ThisIsFun
 */
public class ThisIsFun {

    String name;
    int rollno;
    
    public void setData(String name, int rollno) {
         
    this.name = name;
    this.rollno = rollno;
            
    }
    
    public static void main(String[] args) {
         
    
        ThisIsFun t = new ThisIsFun();
        t.setData("Aravind", 501);
        System.out.println(t.name);
        System.out.println(t.rollno);

    }
}