/**
 * @author Abdul Qadir
 * @date 23 Oct 2025
 * @time 10:34:05 pm
 */
package practiceLoops;
import java.util.Scanner;
public class CountDigit {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
    
}