/**
 * @author Abdul Qadir
 * @date 23 Oct 2025
 * @time 11:47:16 pm
 */
package practiceLoops;
import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("Arithmetic Progression:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a = a + d;
        }
    }
}