package recursion;

import java.util.Scanner;

public class ReverseNumber {

    public static int reverseNumber(int x) {
        return reverseHelper(x, 0);
    }

    private static int reverseHelper(int x, int result) {
        if (x == 0) return result;
        result = result * 10 + (x % 10);
        return reverseHelper(x / 10, result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = input.nextInt();
        System.out.println("Ok!! " + n + " after reversing is : " + reverseNumber(n));
    }
}