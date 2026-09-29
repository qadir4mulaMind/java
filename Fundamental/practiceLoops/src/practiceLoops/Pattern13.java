/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 12:17:35 pm
 */
package practiceLoops;
public class Pattern13 {
    public static void main(String args[]){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++) System.out.print(" ");
            for(int k = i; k <= 5; k++) System.out.print("_");
            System.out.println();
        }
    }
    
}