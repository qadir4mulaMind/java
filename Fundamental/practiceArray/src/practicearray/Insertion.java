/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 10:27:29 pm
 */
package practicearray;
public class Insertion {
    public static void main(String args[]){
        int a[] = new int[15];
        a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4;
        a[4] = 5; a[5] = 6; a[6] = 7; a[7] = 8;
        int n = 8;
        int x = 19;
        int p = 3;
        for(int i  = n; i >= p; i--) a[i] = a[i - 1];
        a[p] = x;
        for(int m : a) System.out.print(m  +  " "); 
    }
    
}