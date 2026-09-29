/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 7:58:44 pm
 */
package conditionalStatement;
public class PracticeSwitch {
    public static void main(String args[]){
        int n = 5;
        
        switch(n){
            case 1 : 
            {
                System.out.println("One");
                break;
            }
            case 2 : 
            {
                System.out.println("Two");
                break;
            }
            case 3 : 
            {
                System.out.println("Three");
                break;
            }
            default: 
            {
                System.out.println("Invalid case");
                break;
            }
        }
    }
    
}