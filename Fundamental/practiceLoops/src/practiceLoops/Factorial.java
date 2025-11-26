/**
 * @author Abdul Qadir
 * @date 23 Oct 2025
 * @time 10:22:32 pm
 */
package practiceLoops;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int fact =  1;
        for(int i = 1; i <= n; i++) fact *= i;
        System.out.println(fact);
    }
    
}