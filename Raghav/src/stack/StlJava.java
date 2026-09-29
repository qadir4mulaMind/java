// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Stack;
class Main {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>(); 
        
        // System.out.println(st.pop()); // error exception we are try  to remove the element from empty stack
        // System.out.println(st.peek()); // Here we are trying to get the top elemnt but it is not present
        st.push("Khusi");
        st.push("Preet");
        st.push("Rishika");
        st.push("Isha");
        st.push("Praysh");
        System.out.println(st.size()); // it gives the size of stack
        System.out.println(st);
        st.pop(); // pop as well as return
        System.out.println(st + " " + st.size());
        System.out.println(st.peek()); // return topmost element without removes it
        System.out.println(st.pop()); // it returns topmost element and removes it
        
        
        // we can't experience stack overflow
        
    }
}
