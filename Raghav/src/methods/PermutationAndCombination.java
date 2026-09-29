package methods;

import java.util.Scanner;

public class PermutationAndCombination
{
    public static int fact(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++) f *= i;
        return f;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = input.nextInt();
        System.out.print("Enter value of r: ");
        int r = input.nextInt();
        int ncr = fact(n) / (fact(r) * fact(n - r));
        System.out.println("NCR: " + ncr);
    }
}