/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 12:07:35 am
 */
package practiceString;
public class CheckingBinaryOrNot {
    public static void main(String args[]){
        int b = 1000110;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]+"));
    }
    
}