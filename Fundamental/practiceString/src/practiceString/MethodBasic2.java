/**
 * @author Abdul Qadir
 * @date 21 Oct 2025
 * @time 1:58:03 pm
 */
package practiceString;
public class MethodBasic2 {
    public static void main(String[] args){
        String str1 = "java";
        String str2 = "java";
        System.out.println(str1 == str2);
        
        String str3 = "Java";
        System.out.println(str1 == str3);
        
        String str4 = new String("java");
        System.out.println(str1 == str4);
        
    }
}