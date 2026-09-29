/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 10:50:11 pm
 */
package practicearray;
public class Copying {
    public static void main(String args[]){
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int b[] = new int[a.length];
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        for(int x : b) System.out.print(x + " "); 
    }
    
}