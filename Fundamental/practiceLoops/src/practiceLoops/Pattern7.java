/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 11:39:03 am
 */
package practiceLoops;
public class Pattern7 {
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++) System.out.format("%02d ", j);
            System.out.println();
        }
    }
    
}