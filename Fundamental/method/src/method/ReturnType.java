/**
 * @author Abdul Qadir
 * @date 19 Nov 2025
 * @time 12:45:07 pm
 */
package method;
public class ReturnType {
    static void change (int[] a, int idx, int val){
        a[idx] = val;
    }
    
    public static void main(String args[]){
        int[] x = {2, 3, 4, 5, 6};
        for(int y : x) System.out.print(y + " ");
        System.out.println();
        change(x, 2, 30);
        for(int y : x) System.out.print(y + " ");
        System.out.println();
    }
    
}