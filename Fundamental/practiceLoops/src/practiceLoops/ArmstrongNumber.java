/**
 * @author Abdul Qadir
 * @date 23 Oct 2025
 * @time 10:41:41 pm
 */
package practiceLoops;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int digits = 0;
        int temp = num;
        // Step 1: Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int sum = 0;
        temp = num;
        // Step 2: Calculate sum of (digit ^ digits)
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        // Step 3: Compare
        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is NOT an Armstrong number.");
    }
}