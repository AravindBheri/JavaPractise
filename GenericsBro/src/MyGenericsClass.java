public class MyGenericsClass <Thing, Thing2> {
    
    Thing x;
    Thing2 y;

    MyGenericsClass(Thing x, Thing2 y) {

        this.x = x;
        this.y = y;

    }

    public Thing getValue() {

        return x;

    } 

    public Thing2 getValue2() {

        return y;

    }
}
