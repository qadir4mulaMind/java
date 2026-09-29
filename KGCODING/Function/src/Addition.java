import java.util.Scanner;

public class Addition {
    public static void main(String[] args)
    {
        System.out.println("Hey Let's start to learn something new.");
        greeting();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        int result = addition(n1, n2);
        System.out.println("The sum of " + n1 + " and " + n2 + " is: " + result);
    }

    public static void greeting()
    {
        System.out.println("OK! I am ready to learn.");
    }

    public static int addition(int a, int b)
    {
        return a + b;
    }
}