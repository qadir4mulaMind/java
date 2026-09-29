package Basic.Challange;

import java.util.Scanner;

public class AreaOfCircle2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = input.nextDouble();
        double area = 3.141592 * r * r;
        System.out.println("The Area of circle is: " + area);
    }
}