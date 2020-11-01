class SampleException {
    
    public static void main(String[] args) {

        try {
            throw new MyException(6);
        } 
        catch(Exception e) {
            System.out.println(e);
        }

    }

}

class MyException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -2558227997563189633L;
    int a;
    MyException(final int b) {
        a = b;
    }
    public String toString() {
        return ("Exception number:" + a);
    }
}