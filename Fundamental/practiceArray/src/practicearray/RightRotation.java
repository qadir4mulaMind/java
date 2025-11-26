/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 10:12:26 pm
 */
package practicearray;
public class RightRotation {
    public static void main(String args[]){
        int a[] = new int[15];
        a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4;
        a[4] = 5; a[5] = 6; a[6] = 7; a[7] = 8;
       int temp = a[a.length - 1];
       for(int i = a.length - 1; i > 0; i--) a[i] = a[i - 1];
       a[0] =  temp;
       for(int x : a) System.out.print(x + " ");
       System.out.println();
    }
}