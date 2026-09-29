/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 12:03:46 pm
 */
package practiceLoops;
public class Pattern11 {
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5 - i + 1; j++) System.out.format("%02d ", j);
            System.out.println();
        }
    }
    
}