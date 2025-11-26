/**
 * @author Abdul Qadir
 * @date 18 Nov 2025
 * @time 4:28:06 pm
 */
package practicearray;
public class SortMethod {
    public static void main(String args[]){
        String []arr = { "Python", "Java", "Pascal", "Smalltalk", "Ada", "Basic"};
        java.util.Arrays.sort(arr);
        for(String x : arr){
            System.out.print(x + " ");
            System.out.println();
        }
    }
    
}