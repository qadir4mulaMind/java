/**
 * @author Abdul Qadir
 * @date 21 Oct 2025
 * @time 1:57:35 pm
 */
package practiceString;
public class MethodsBasic {
    public static void main(String[] args){
        String str1 = "java Program";
        System.out.println(str1);
        String str2 = new String("JAVA");
        System.out.println(str2);
        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c);
        System.out.println(str3);
        byte b[] = {65, 66, 67, 78};
        String str4 = new String(b);
        System.out.println(str4);
        String str5 = new String(c, 1, 3);
        System.out.println(str5);
        String str6 = new String(b, 1, 3);
        System.out.println(str6);
    }
}