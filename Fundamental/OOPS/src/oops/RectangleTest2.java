/**
 * @author Abdul Qadir
 * @date 1 Dec 2025
 * @time 10:09:41 am
 */
package oops;
class Rectangle{
    private double length;
    private double breadth;
    
    public void setLength(double l){
        if(l > 0) length = l;
        else length = 0;
    }
    
    public void setBreadth(double b){
        if(b > 0) breadth = b;
        else breadth = 0;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getBreadth(){
        return breadth;
    }
    
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
public class RectangleTest2 {
    public static void main(String args[]){
        RectangleTest3 r1 = new RectangleTest3();
        r1.setLength(12.3);
        r1.setBreadth(13.90);
        System.out.println("Area1: " + r1.area());
        System.out.println("Perimeter1: " + r1.perimeter());
        System.out.println("validity1: " + r1.isSquare());
        
        RectangleTest3 r2 = new RectangleTest3();
        r2.setBreadth(19.3);
        r2.setBreadth(19.3);
        System.out.println("\nArea2: " + r2.area());
        System.out.println("Perimeter2: " + r2.perimeter());
        System.out.println("validity2: " + r2.isSquare());
    }
    
}