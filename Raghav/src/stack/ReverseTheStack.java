package stack;

import java.util.Stack;

public class ReverseTheStack {

    public static void pushAtBottom(Stack<Integer> s, int ele){
        if(s.size() == 0){
            s.push(ele);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, ele);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.size() == 0) return;
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        reverse(st);

        while(st.size() != 0){
            System.out.print(st.pop() + " ");
        }
    }
}