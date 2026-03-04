/**
 * @author Abdul Qadir
 * @date 29 Nov 2025
 * @time 6:36:24 pm
 */
package oops;
class Rectangle{
    public double length;
    public double breadth;
    
    public double area(){
        return length * breadth;
    }
    
    public double perimeter(){
        return 2 * (length + breadth); 
    }
    
    public boolean isSquare(){
        return length == breadth ? true : false;
    }
}
public class RectangleTest {
    public static void main(String args[]){
        RectangleTest3 r1 = new RectangleTest3();
        r1.length = 12.3;
        r1.breadth = 13.9;
        System.out.println("Area1: " + r1.area());
        System.out.println("Perimeter1: " + r1.perimeter());
        System.out.println("validity1: " + r1.isSquare());
        
        RectangleTest3 r2 = new RectangleTest3();
        r2.length = 19.3;
        r2.breadth = 19.3;
        System.out.println("\nArea2: " + r2.area());
        System.out.println("Perimeter2: " + r2.perimeter());
        System.out.println("validity2: " + r2.isSquare());
    }
    
}