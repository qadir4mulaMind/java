package ConditionalStatement;

import java.util.Scanner;

public class IsInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = input.nextDouble();
        //int x = (int)n;
        double x = (int)n;
        // if(n - int(n) == 0) -> integer
        if(n - x > 0) System.out.println("Not an integer!");
        else System.out.println("Integer!");
    }
}