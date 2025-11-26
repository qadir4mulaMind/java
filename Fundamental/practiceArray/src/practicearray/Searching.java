/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 9:24:43 pm
 */
package practicearray;
import java.util.Scanner;
public class Searching {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        System.out.print("Enter a key: ");
        int key = input.nextInt();
        for(int i = 0; i < a.length; i++){
            if(a[i] == key){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("Element is not found.");
    }
    
}