/**
 * @author Abdul Qadir
 * @date 29 Nov 2025
 * @time 7:04:25 pm
 */
package oops;
class Cylender{
    public double radius;
    public double height;
    
    public double lidArea(){
        return Math.PI * radius * radius;
    }
    
    public double circumference(){
        return 2 * Math.PI * radius;
    }
    
    public double totalSurfaceArea(){
        return 2 * lidArea() + circumference() * height;
    }
    
    public double volume(){
        return lidArea() * height;
    }
}
public class CylenderTest {
    public static void main(String args[]){
        Cylender c1 = new Cylender();
        c1.radius = 12.1;
        c1.height = 8.2;
        System.out.println("LidArea1: " + c1.lidArea());
        System.out.println("Circumference1: " + c1.circumference());
        System.out.println("TotalArea1: " + c1.totalSurfaceArea());
        System.out.println("Volume1: " + c1.volume());
        
        Cylender c2 = new Cylender();
        c2.radius = 16.1;
        c2.height = 5.2;
        System.out.println("\nLidArea2: " + c2.lidArea());
        System.out.println("Circumference2: " + c2.circumference());
        System.out.println("TotalArea12: " + c2.totalSurfaceArea());
        System.out.println("Volume2: " + c2.volume());
    }
    
}