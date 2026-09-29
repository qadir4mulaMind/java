/**
 * @author Abdul Qadir
 * @date 26 Nov 2025
 * @time 7:06:04 pm
 */
package method;
public class MaxBetweenNumber {
    static int max(int ...a){
        if(a.length == 0) return Integer.MIN_VALUE;
        int m = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > m) m = a[i];
        }
        return m;
    }
    public static void main(String args[]){
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10, 20));
        System.out.println(max(10, 20, 30));
        System.out.println(max(10, 20, 30, 40));
        System.out.println(max(40, 50, 30, 14, 65));
        System.out.println(max(70, 60, 90, 45, 30, 99));
    }
    
}