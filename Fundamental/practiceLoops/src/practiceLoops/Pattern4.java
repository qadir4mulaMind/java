/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 11:19:27 am
 */
package practiceLoops;
public class Pattern4 {
    public static void main(String args[]){
        int count = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }
    
}