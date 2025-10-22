/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 6:17:22 pm
 */
package conditionalStatement;
import java.util.Scanner;
public class Redix {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        String num = input.nextLine();
        if(num.matches("[01]+")) System.out.println("Redix in 2 that is binary");
        else if(num.matches("[0-8]+")) System.out.println("Redix is 8 that is octal");
        else if(num.matches("[0-9]+")) System.out.println("Redix is 10 that is Decimal.");
        else if(num.matches("[0-9A-F]+")) System.out.println("Redix is 16 that is hexadecimal.");
        else System.out.println("Not a number");
    }
    
}