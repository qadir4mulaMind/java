/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 1:26:19 pm
 */
package practiceLoops;
public class Pattern18 {
    public static void main(String args[]){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) System.out.print("  ");
            for (int k = 5 - i - 1; k < 5; k++) System.out.print("* ");
            for (int l = 0; l < i; l++) System.out.print("* ");
            System.out.println();
        }

        // lower half
        for (int i = 5 - 2; i >= 0; i--) {
            for (int j = 5 - i; j > 0; j--) System.out.print("  ");
            for (int k = 5 - i - 1; k < 5; k++) System.out.print("* ");
            for (int l = 0; l < i; l++) System.out.print("* ");
            System.out.println();
        }
    }
    
}