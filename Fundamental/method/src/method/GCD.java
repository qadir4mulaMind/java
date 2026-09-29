/**
 * @author Abdul Qadir
 * @date 20 Nov 2025
 * @time 1:34:35 pm
 */
package method;
public class GCD {
    static int gcd(int m, int n){
        while(m != n){
            if(m > n) m = m - n;
            else n = n - m;
        }
        return m;
    }
    public static void main(String args[]){
        System.out.println(gcd(25, 15));
        System.out.println(gcd(3, 19));
    }
    
}