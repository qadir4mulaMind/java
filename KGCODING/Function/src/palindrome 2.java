import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a Palindrome number.");
        } else {
            System.out.println(n + " is not a Palindrome number.");
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num /= 10;
        }

        return original == reversed;
    }
}