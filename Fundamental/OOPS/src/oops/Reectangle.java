/**
 * @author Abdul Qadir
 * @date 5 Feb 2026
 * @time 4:48:00 pm
 */
package oops;
public class Reectangle{
    private double length;
    private double breadth;

    public Reectangle() {
        length = 1;
        breadth = 1;
    }

    public Reectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public Reectangle(double s) {
        length = breadth = s;
    }
}

class RectangleTest3 {
    public static void main(String[] args) {
        Reectangle r = new Reectangle();
    }
}