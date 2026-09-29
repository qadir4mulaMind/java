/**
 * @author Abdul Qadir
 * @date 20 Nov 2025
 * @time 1:41:57 pm
 */
package method;
public class MaximumNumber {
    static int maxNum(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            if(a[i] > max) max = a[i]; 
        }
        return max;
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 23, 4, 5, 6};
        System.out.println(maxNum(arr));
    }
    
}