/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 9:32:36 pm
 */
package practicearray;
public class LargestElement {
    public static void main(String args[]){
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int l = a[0];
        for(int x : a){
            if(x > l) l = x;
        }
        System.out.println(l);
    }
    
}