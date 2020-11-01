/**
 * hello
 */
public class Shape {
        public double length;
        public double width;
        public void display(double area)
{
        System.out.println("Area is :" + area);
}
public double area(double l,double wid){
        return length*width;
}
public double area(Shape obj){
        return obj.length*width;
}

         
            }
            class Rectangle extends Shape{
                    public Rectangle(double s,double wid){
                            length = s;
                            width = wid;
                    }
             public static void main(String[] args){
        double a;
        Rectangle s = new Rectangle(10.5,5.0);
        Rectangle s1 = new Rectangle(20.5,10.0);
        a = s.area(s.length,s.width);
        s.display(a);
        a = s1.area(s1.length,s.width);
        s1.display(a); } 
             }
            
