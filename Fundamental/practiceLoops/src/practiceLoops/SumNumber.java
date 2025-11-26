/**
 * @author Abdul Qadir
 * @date 23 Oct 2025
 * @time 10:14:51 pm
 */
package practiceLoops;
import java.util.Scanner;
public class SumNumber {
    public static void main(String args[]){
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in); 
        int n = input.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++) sum += i;
        System.out.println(sum);
    }
    
}