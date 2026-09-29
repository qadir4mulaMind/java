package methods;

import java.util.Scanner;

public class MaxOfThreeBuildin2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        System.out.print("Enter third number: ");
        int n3 = input.nextInt();
        System.out.println(Math.max(Math.max(n1, n2),n3));
    }
}