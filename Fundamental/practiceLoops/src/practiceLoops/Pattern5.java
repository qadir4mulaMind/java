/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 11:22:52 am
 */
package practiceLoops;
public class Pattern5 {
    public static void main(String args[]){
        int count = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                count++;
                System.out.format("%2d ", count);
            }
            System.out.println();
        }
    }
    
}