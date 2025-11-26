/**
 * @author Abdul Qadir
 * @date 4 Nov 2025
 * @time 7:56:00 pm
 */
package practicearray;
public class PracticeArray {
    public static void main(String args[]){
        int a[] = new int[10];
        int b[] = {1, 2, 3, 4, 5};
        int c[];
        c = new int[10];
        int []d = new int[5];
        int[] e = new int[6];
        b[2] = 15;
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        } 
        System.out.println();
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int x : b){
            System.out.print(x + " "); 
        }
        System.out.println();
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]++ + " ");
        }
        System.out.println();
        for(int x : b){
            System.out.print(x + " "); 
        }
        System.out.println();
        System.out.println(b);
    }
    
}