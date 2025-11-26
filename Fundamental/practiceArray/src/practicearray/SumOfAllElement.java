/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 9:07:44 pm
 */
package practicearray;
public class SumOfAllElement {
    public static void main(String args[]){
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i]; 
        }
        System.out.println(sum);
    }
    
}