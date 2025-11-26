/**
 * @author Abdul Qadir
 * @date 19 Nov 2025
 * @time 11:44:47 am
 */
package method;
public class Basic {
    static int max(int x, int y){
        return x > y ? x : y;
    }
    static void inc(int x){
        x++;
        System.out.println("value in inc mathod " + x);
        
    }
    
    public static void main(String args[]){
        int a = 10, b = 15;
        System.out.println(max(a, b));
        inc(a);
        System.out.println("value in main method " +  a);
    }
    
}