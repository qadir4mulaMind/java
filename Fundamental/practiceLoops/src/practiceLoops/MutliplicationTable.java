/**
 * @author Abdul Qadir
 * @date 23 Oct 2025
 * @time 10:00:03 pm
 */
package practiceLoops;
import java.util.Scanner;
public class MutliplicationTable {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
    
}