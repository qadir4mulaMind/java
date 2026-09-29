import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Now enter second number: ");
        int num2 = input.nextInt();

        int result = lcm(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + result + ".");
    }

    public static int gcd(int a, int b) {
        int hcf = 1;
        int min = (a < b) ? a : b;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        return hcf;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}