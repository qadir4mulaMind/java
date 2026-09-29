import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = input.nextDouble();

        double pi = 3.14;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("Area of circle: " + area);
        System.out.println("Circumference of circle: " + circumference);
    }
}