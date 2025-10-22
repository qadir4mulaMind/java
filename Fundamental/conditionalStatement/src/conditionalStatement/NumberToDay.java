/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 6:57:20 pm
 */
package conditionalStatement;
import java.util.Scanner;
public class NumberToDay {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Day number: ");
        int day = input .nextInt();
        if(day == 1) System.out.println("Monday");
        else if(day == 2) System.out.println("Tuesday");
        else if(day == 3) System.out.println("Wednesday");
        else if(day == 4) System.out.println("Thuresday");
        else if(day == 5) System.out.println("Friday");
        else if(day == 6) System.out.println("Saturday");
        else if(day == 7) System.out.println("Sunnday");
        else System.out.println("Enter valid day number");
    }
    
}