import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean result = PRIME(num);
        if (result) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }

    public static boolean PRIME(int a) {
        if (a <= 1) return false;

        int i = a - 1;
        while (i >= 2) {
            if (a % i == 0) {
                return false;
            }
            i--;
        }
        return true;
    }
}