package in.Qadir.utils;

import in.Qadir.geometry.Circle;
import in.Qadir.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 5);
        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.length * rect.breadth;

        System.out.printf("Area of circle is: %f and Area of Rectangle is: %f", cirArea, rectArea);
    }
}