/**
 * @author Abdul Qadir
 * @date 26 Nov 2025
 * @time 7:22:01 pm
 */
package method;
public class Discount {
    static double dis(double ...p){
        double s = 0;
        for(int i = 0; i < p.length; i++) s += p[i];
        if(s < 500) return s * 10 / 100;
        else if(s >= 500 && s <= 1000) return s * 15 / 100;
        else return s * 20 / 100;
    }
    
    public static void main(String args[]){
        System.out.println(dis());
        System.out.println(dis(10));
        System.out.println(dis(302, 409));
        System.out.println(dis(1000, 2999, 267));
    }
    
}