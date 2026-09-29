package Basic.Challange;

import java.util.Scanner;

public class SumOfTwo2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number:");
        int n2 = input.nextInt();
        System.out.println("Sum of " + n1 + " and " + n2 + " is : " + (n1 + n2));
    }
}