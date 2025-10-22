/**
 * @author Abdul Qadir
 * @date 21 Oct 2025
 * @time 10:30:51 pm
 */
package practiceString;
public class RegularExpression {
    public static void main(String args[]){
        String str1 = "f";
        System.out.println(str1.matches("."));
        str1 = "8";
        System.out.println(str1.matches("."));
        str1 = "abc";
        System.out.println(str1.matches("."));
        str1 = "a";
        System.out.println(str1.matches("[abc]"));
        str1 = "b";
        System.out.println(str1.matches("[abc]"));
        str1 = "c";
        System.out.println(str1.matches("[abc]"));
        str1 = "ab";
        System.out.println(str1.matches("[abc]"));
        str1 = "p";
        System.out.println(str1.matches("[abc]"));
        System.out.println(str1.matches("[^abc]"));
        System.out.println(str1.matches("[a-z0-9]"));
        System.out.println(str1.matches("[a-z][0-9]"));
        System.out.println(str1.matches("a|b"));
        System.out.println(str1.matches("abc"));
        str1 = "a";
        System.out.println(str1.matches("\\w"));
        str1 = "5";
        System.out.println(str1.matches("\\w"));
        System.out.println(str1.matches("\\W"));
        System.out.println(str1.matches("\\d"));
        str1 = "a";
        System.out.println(str1.matches("\\d"));
        System.out.println(str1.matches("\\D"));
    }
}