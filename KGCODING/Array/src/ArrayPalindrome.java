import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of array...");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }

        if (isPalindrome(arr)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }
    }

    public static boolean isPalindrome(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            if (a[start] != a[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}