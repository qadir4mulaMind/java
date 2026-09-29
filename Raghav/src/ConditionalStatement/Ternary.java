package ConditionalStatement;

import java.util.Scanner;

public class Ternary
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // condition ? sach : jhoot
        System.out.print("Enter number: ");
        int n = input.nextInt();
        System.out.println(n + " is " + ((n % 2 == 0) ? "even." : "odd."));
    }
}