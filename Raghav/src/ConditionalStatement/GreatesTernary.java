package ConditionalStatement;

import java.util.Scanner;

public class GreatesTernary
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
        System.out.printf("%d is greatest", (n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3)));
    }
}