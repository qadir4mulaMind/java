/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 6:45:45 pm
 */
package conditionalStatement;
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0) System.out.println("Leap Year");
                else System.out.println("Not a Leap Year.");
            } else System.out.println("Leap year.");
        } else System.out.println("Not a Leap Year");
    }
    
}