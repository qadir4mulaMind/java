/**
 * @author Abdul Qadir
 * @date 26 Nov 2025
 * @time 10:13:25 pm
 */
package method;
public class Recursion {
    static void print(int n){
        if(n > 0){
            System.out.print(n + " ");
            print(n - 1);
        }
    }
    
    static void print2(int n){
        if(n > 0){
            print(n - 1);
            System.out.print(n + " ");
        }
    }
    
    public static void main(String args[]){
        print(3);
        System.out.println();
        print2(4);
        System.out.println();
    }
    
}