package stack;

import java.util.Stack;

public class BasicOFStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size() == 0);
        // System.out.println(st.peek());
        // st.pop() underflow
        st.push("Khusi");
        st.push("Preet");
        st.push("Rishika");
        st.push("Isha");
        st.push("Praysh");
        System.out.println(st.size());
        System.out.println(st); // A.S => O(n)
        st.pop();
        System.out.println(st + " " + st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}