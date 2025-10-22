/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 4:08:56 pm
 */
package conditionalStatement;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if(n % 2 == 0) System.out.println("Number is Even.");
        else System.out.println("Number is Odd.");
    }
    
}