/**
 * @author Abdul Qadir
 * @date 23 Oct 2025
 * @time 11:56:05 pm
 */
package practiceLoops;
public class NestedLoop {
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++) System.out.print("(" + i + "," + j + ") ");
            System.out.println();
        }
    }
    
}