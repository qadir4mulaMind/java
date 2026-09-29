/**
 * @author Abdul Qadir
 * @date 26 Nov 2025
 * @time 7:14:02 pm
 */
package method;

import static method.MaxBetweenNumber.max;

public class Sum {
    static int sum(int ...a){
        int s = 0;
        for(int i = 0; i < a.length; i++) s += a[i];
        return s;
    }
    public static void main(String args[]){
        System.out.println(sum());
        System.out.println(sum(10));
        System.out.println(sum(10, 20, 12));
    }
    
}