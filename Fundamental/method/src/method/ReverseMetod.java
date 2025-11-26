/**
 * @author Abdul Qadir
 * @date 26 Nov 2025
 * @time 1:58:47 pm
 */
package method;
public class ReverseMetod {
    static int rev(int n){
        int rev = 0;
        while(n != 0){
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }
    
    static int [] rev(int[] a){
        int[] b = new int[a.length]; 
        for(int i = a.length - 1, j = 0; i >= 0; i--, j++){
            b[j] = a[i];
        }
        return b;
    }
    
    public static void main(String args[]){
        int[] x = {1, 2, 3, 4, 5, 6};
        int[] y = rev(x);
        System.out.println();
        for(int p : y) System.out.print(p + " ");
        System.out.println(rev(1234));
    }
    
}