/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 4:36:58 pm
 */
package conditionalStatement;
import java.util.Scanner;
public class YoungOrNot {
    public static void main(String args[]){
        System.out.print("Enter age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age >= 14 && age <= 45) System.out.println("Young");
        else System.out.println("Not Young");
    }
    
}