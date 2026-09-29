/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 10:54:53 pm
 */
package practicearray;
public class ReverseCopying {
    public static void main(String args[]){
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int b[] = new int[a.length];
        for(int i = 0; i < a.length; i++){
            b[a.length - i - 1] = a[i];
        }
        for(int x : b) System.out.print(x + " "); 
    }
    
}