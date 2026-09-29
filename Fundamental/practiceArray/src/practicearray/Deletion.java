/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 10:40:44 pm
 */
package practicearray;
public class Deletion {
    public static void main(String args[]){
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int p = 2;
        for(int i = 2; i < a.length; i++){
            a[i - 1] = a[i];
        }
        a[a.length - 1] = 0;
        for(int x : a) System.out.print(x + " ");
    }
    
}