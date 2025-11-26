/**
 * @author Abdul Qadir
 * @date 26 Nov 2025
 * @time 3:09:18 pm
 */
package method;
public class VariableArgument {
    static void show(int ...a){
        for(int x : a) System.out.print(x + " ");
    }
    
    static void showList(String ...s){
        for(int i = 0; i < s.length; i++){
            System.out.println(i + 1 + ". " + s[i]);
        }
    }
    public static void main(String ...args){
        show(); 
        System.out.println();
        show(10);
        System.out.println();
        show(10, 20, 30);
        System.out.println();
        show(new int[]{10, 20, 30, 40});
        System.out.println();
        showList("Abdul", "Qadir", "chahat", "Husain");
    }
    
}