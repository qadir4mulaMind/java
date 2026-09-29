package ConditionalStatement;

import java.util.Scanner;

public class GreatestOfThree
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
        if(n1 == n2 && n2 == n3 && n1 == n3) System.out.printf("%d, %d, %d all are equal.\n", n1, n2, n3);
        else if(n1 > n2 && n1 > n3) System.out.println(n1 + " is greatest number.");
        else if(n2 > n3) System.out.println(n2 + " is greatest number.");
        else System.out.println(n3 + " is greatest number.");
    }
}