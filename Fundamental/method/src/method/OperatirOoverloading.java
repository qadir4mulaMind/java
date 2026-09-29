/**
 * @author Abdul Qadir
 * @date 20 Nov 2025
 * @time 1:54:55 pm
 */
package method;
public class OperatirOoverloading {
    static int max(int a, int b){
        return a > b ? a : b;
    }
    
    static float max(float a, float b){
        return a > b ? a : b;
    }
    
    static int max(int a, int b, int c){
        return a > b && a > b ? a : (b > c ? b : c);
    }
    
    static double max(double  a, double b){
        return a > b ? a : b;
    }
    static byte max(byte a, byte b){
        return a > b ? a : b;
    }
    
    public static void main(String args[]){
        byte m = 10, n = 7;
        System.out.println(max(10, 5));
        System.out.println(max(12.6f, 8.9f));
        System.out.println(max(12, 33, 23));
        System.out.println(max(12.3, 7.4));
        System.out.println(max(m, n));
    }
    
}