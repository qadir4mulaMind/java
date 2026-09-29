package recursion;

import java.util.Scanner;

public class Reverse{
    static int rev = 0; // static variable to hold reversed number

    public static int reverseNumber(int x) {
        if (x == 0) return rev;
        rev = rev * 10 + (x % 10);
        return reverseNumber(x / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = input.nextInt();
        System.out.println("Ok!! " + n + " after reversing is : " + reverseNumber(n));
    }
}