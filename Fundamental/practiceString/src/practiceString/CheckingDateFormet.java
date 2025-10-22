/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 12:21:58 am
 */
package practiceString;
public class CheckingDateFormet {
    public static void main(String args[]){
        String str = "15/04/2004";
        System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
    
}