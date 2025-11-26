/**
 * @author Abdul Qadir
 * @date 19 Nov 2025
 * @time 11:57:38 am
 */
package method;
public class StaticK {
    int max(int x, int y){
        return x > y ? x : y;
    }
    
    public static void main(String args[]){
        int a = 10, b = 15;
        StaticK mp = new StaticK();
        System.out.println(mp.max(a, b));
    }
    
}