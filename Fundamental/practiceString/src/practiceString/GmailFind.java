/**
 * @author Abdul Qadir
 * @date 21 Oct 2025
 * @time 11:46:38 pm
 */
package practiceString;
public class GmailFind {
    public static void main(String args[]){
        String str = "programer@hotmail.com";
        int i = str.indexOf("@");
        String userName = str.substring(0, i);
        String domainName = str.substring(i + 1, str.length());
        
        System.out.println("User name : " + userName);
        System.out.println("Domain name : " + domainName);
        
        System.out.println(domainName.startsWith("gmail"));
    }
    
}