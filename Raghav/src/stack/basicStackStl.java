// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Stack;
class Main {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
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
    }
}


// 5
// [Khusi, Preet, Rishika, Isha, Praysh]
// [Khusi, Preet, Rishika, Isha] 4
// Isha
// Isha
