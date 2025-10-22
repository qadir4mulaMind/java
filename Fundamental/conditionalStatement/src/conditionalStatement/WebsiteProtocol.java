/**
 * @author Abdul Qadir
 * @date 22 Oct 2025
 * @time 7:12:21 pm
 */
package conditionalStatement;
import java.util.Scanner;
public class WebsiteProtocol {
    public static void main(String args[]){
        System.out.print("Enter a URL: ");
        Scanner input = new Scanner(System.in);
        String url = input.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        if(protocol.equals("http")) System.out.println("Hypertext transfer Protoclos.");
        else if(protocol.equals("ftp")) System.out.println("File Transfer Protocols.");
         
        String ext = url.substring(url.lastIndexOf(".") + 1); 
        if(ext.equals("com")) System.out.println("Commercial");
        else if(ext.equals("org")) System.out.println("Organisation");
        else if(ext.equals("net")) System.out.println("Network.");
         
    }
    
}