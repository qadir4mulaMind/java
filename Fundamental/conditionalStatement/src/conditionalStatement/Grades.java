/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 4:46:29 pm
 */
package conditionalStatement;
import java.util.Scanner;
public class Grades {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks of Physics: ");
        int physicsMarks = input.nextInt();
        System.out.print("Enter marks of chemistry: ");
        int chemistryMarks = input.nextInt();
        System.out.print("Enter marks of Maths: ");
        int mathsMarks = input.nextInt();
        float avg = (physicsMarks + chemistryMarks + mathsMarks) / 3;
        if(avg >= 70) System.out.println("Grade A");
        else if(avg < 70 && avg >= 60) System.out.println("Grade B");
        else if(avg < 60 && avg >= 50) System.out.println("Garde C");
        else if(avg < 50 && avg >= 40) System.out.println("Grade D");
        else System.out.println("Fail");
    }
    
}