/**
 * @author Abdul Qadir
 * @date 23 Oct 2025
 * @time 10:44:42 pm
 */
package practiceLoops;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String args[]){
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = 0;
        while(n > 0){
            num *= 10;
            int r = n % 10;
            num += r;
            n /= 10;
        }
        System.out.println(num);
    }
    
}