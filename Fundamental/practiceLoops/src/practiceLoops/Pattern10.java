/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 11:58:56 am
 */
package practiceLoops;
public class Pattern10 {
    public static void main(String args[]){
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++) System.out.format("%02d ", j);
            System.out.println();
        }
    }
    
}