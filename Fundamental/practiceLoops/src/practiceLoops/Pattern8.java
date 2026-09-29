/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 11:45:44 am
 */
package practiceLoops;
public class Pattern8 {
    public static void main(String args[]){
        int count = 0; 
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++) System.out.format("%02d ", ++count);
            System.out.println();
        }
    }
    
}