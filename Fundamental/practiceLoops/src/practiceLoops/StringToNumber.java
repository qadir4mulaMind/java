/**
 * @author Abdul Qadir
 * @date 23 Oct 2025
 * @time 11:27:35 pm
 */
package practiceLoops;
import java.util.*;

public class StringToNumber {
    public static void main(String args[]){
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = "";
        while(n > 0){
            int r = n % 10;
            n /= 10;
            str = r + str;
        }
        char c;
        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            switch(c){
            case '0' : {
                System.out.print("Zero" + " ");
                break;
            }
            case '1' : {
                System.out.print("One" + " ");
                break;
            }
            case '2' :
            {
                System.out.print("Two" + " ");
                break;
            }
            case '3' : {
                System.out.print("Three" + " ");
                break;
            }
            case '4' : {
                System.out.print("Four" + " ");
                break;
            }
            case '5' :{
                System.out.print("Five" + " ");
                break;
            }
            case '6' :{
                System.out.print("Six" + " ");
                break;
            }
            case '7' :{
                System.out.print("Seven" + " ");
                break;
            }
            case '8':{
                System.out.print("Eight" + " ");
                break;
            }
            case '9' :{
                System.out.print("Nine" + " ");
                break;
            }
        }
        }
        System.out.println();
    }
    
}