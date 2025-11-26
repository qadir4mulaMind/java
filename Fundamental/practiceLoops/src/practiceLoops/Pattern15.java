/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 1:01:29 pm
 */
package practiceLoops;
public class Pattern15 {
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(i + j > 5) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}