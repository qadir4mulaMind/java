/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 3:57:40 pm
 */
package conditionalStatement;
public class GreaterAmongThree {
    public static void main(String args[]){
        int a = 5, b = 18, c = 15;
        if(a > b && a > c) System.out.println(a + " is greater.");
        else if(b > c) System.out.println(b + " is greater.");
        else System.out.println(c + " is greater");
    }
    
}