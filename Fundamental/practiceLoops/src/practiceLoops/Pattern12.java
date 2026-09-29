/**
 * @author Abdul Qadir
 * @date 3 Nov 2025
 * @time 12:08:20 pm
 */
package practiceLoops;
public class Pattern12 {
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5 - i + 1; j++) System.out.print("_");
            System.out.println();
        }
    }
    
}