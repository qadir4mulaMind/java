/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fomet_printing;
/**
 *
 * @author abdulqadir0210423gmail.com
 */
public class Fomet_printing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        float y = 112.44f;
        char c = 'A';
        String str = "Hello";
        System.out.printf("Hello");
        System.out.printf("Hello\n");
        System.out.printf("%d, %f, %c\n", x, y, c);
        System.out.printf("%o, %f, %c\n", x, y, c);
        System.out.printf("%x, %f, %c\n", x, y, c);
        System.out.printf("%d, %e, %c\n", x, y, c);
        System.out.printf("%d, %g, %c\n", x, y, c);
        System.out.printf("%s\n", str);
        System.out.printf("%s\n", "Java");
        System.out.printf("%1$d, %1$d, %1$d\n",x);
        System.out.printf("%1$d, %2$f, %1$d\n",x, y);
    }
    
}