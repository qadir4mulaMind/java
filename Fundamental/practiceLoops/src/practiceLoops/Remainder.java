/**
 * @author Abdul Qadir
 * @date 23 Oct 2025
 * @time 10:28:08 pm
 */
package practiceLoops;
import java.util.Scanner;
public class Remainder {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        while(n > 0){
            int r = n % 10;
            System.out.print(r + " ");
            n = n / 10;
        }
    }
    
}