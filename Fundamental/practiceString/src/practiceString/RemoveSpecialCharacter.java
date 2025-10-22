/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 12:33:13 am
 */
package practiceString;
public class RemoveSpecialCharacter {
    public static void main(String args[]){
        String str = "a!B@c#1$2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
        
        str = "    abc    def   ghi  jk   ";
        System.out.println(str.replaceAll("\\s+"," ").trim());
        str = str.replaceAll("\\s+"," ").trim();
        String words[] = str.split("\\s");
        System.out.println(words.length);
    }
    
}