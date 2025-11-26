/**
 * @author Abdul Qadir
 * @date 20 Nov 2025
 * @time 12:34:08 pm
 */
package method;
public class Prime {
    static boolean isPrime(int n){
        for(int i = 2; i < n / 2; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(isPrime(19));
        System.out.println(isPrime(91)); 
    }
    
}