/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 10:07:34 pm
 */
package practicearray;
public class LeftRotation {
    public static void main(String args[]){
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int temp = a[0];
        for(int i = 1; i < a.length; i++){
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
        for(int x : a) System.out.print(x + " "); 
        System.out.println();
    }
}