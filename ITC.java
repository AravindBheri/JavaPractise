/**
 * ITC
 */
class A {
    int num;
    Boolean valueSet = false;

    public synchronized void set(int num) {
        while (valueSet) {
           try{
            wait();
           } catch(Exception e) {

           }
        }
        System.out.println("Num :" + num);
        this.num = num;
        valueSet = true;
        notify();
    }
    public synchronized void get() {
        while(!valueSet) {
            try{
                wait();
               } catch(Exception e) {
    
               }
        }
        System.out.println(num);
        valueSet = false;
        notify();
    }
}
class Producer implements Runnable {
    A a;

    public Producer(A a) {
        this.a = a;
        Thread t = new Thread();
        t.start();
    }
    public void run() {
        int i = 0;
        while(true) {
            a.set(i++);
        }
    }  
}
class Consumer implements Runnable {
    A a;

    public Consumer(A a) {
        this.a = a;
        Thread t = new Thread();
        t.start();
    }
    public void run() {
        while(true) {
            a.get();
        }
    }
    
    
}
public class ITC {

    public static void main(String[] args) {
        A a = new A();
        new Producer(a);
        new Consumer(a);
        
    }
}