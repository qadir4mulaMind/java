/**
 * @author Abdul Qadir
 * @date 21 Oct 2025
 * @time 9:30:22 pm
 */
package practiceString;
public class StringComprihension {
    public static void main(String args[]){
        String str = "www.abcd.org";
        System.out.println(str.startsWith("wwww"));
        System.out.println(str.endsWith("org"));
        System.out.println(str.charAt(6));
        System.out.println(str.indexOf("."));
        System.out.println(str.indexOf(".", 4));
        System.out.println(str.lastIndexOf("."));
        
        String str1 = "JAVA";
        String str2 = "java";
        String str3 = "python";
        String str4 = "python";
        String str5 = new String("python");
        System.out.println(str3.equals(str4));
        System.out.println(str4.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str3.compareTo(str3));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));
        System.out.println(str4.equals(str3));
        System.out.println(str3 == str4);
        System.out.println(str4 == str5);
        
        String str6 = "The great wall of china";
        System.out.println(str6.contains("wall"));
        String str7 = "India is best";
        System.out.println(str6.concat(str7));
        System.out.println(str6 + str7);
    }
    
}