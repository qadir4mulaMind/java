/**
 * @author Abdul Qadir
 * @date 26 Nov 2025
 * @time 2:24:27 pm
 */
package method;
public class ValidateAge {
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]*");
    }
    
    static boolean validate(int age){
        return age >= 3 && age <= 15;
    }
    
    public static void main(String args[]){
        System.out.println(validate("Abdul Qadir")); // true
        System.out.println(validate("Abdul123"));      // false
        
        System.out.println(validate(10));  // true
        System.out.println(validate(20));  // false
    }
    
}