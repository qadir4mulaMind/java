/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 9:10:37 pm
 */
package practicearray;
public class Sum1 {
    public static void main(String args[]){
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int sum = 0;
        for(int x : a){
            sum += x;
        }
        System.out.println(sum);
    }
    
}