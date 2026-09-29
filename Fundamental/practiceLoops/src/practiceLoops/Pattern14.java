/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 12:45:55 pm
 */
package practiceLoops;
public class Pattern14 {
    public static void main(String args[]){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5 - i; j++){
                System.out.print("  ");
            }
            for(int k = 5 - i - 1; k < 5; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}