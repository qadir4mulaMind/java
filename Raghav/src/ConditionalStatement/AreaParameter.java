package ConditionalStatement;

import java.util.Scanner;

public class AreaParameter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double l = input.nextDouble();
        System.out.print("Enter Breadth: ");
        double b = input.nextDouble();
        double area = l * b;
        double parameter = 2 * (l + b);
        if(area > parameter) System.out.println("Area is greater than parameter.");
        else System.out.println("Area is less than parameter.");
    }
}