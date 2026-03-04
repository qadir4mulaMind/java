package stack;

import java.util.Stack;

public class PushAtBottom {

    static Stack<Integer> st = new Stack<>();

    public static void pushAtBottom(int ele){
        if(st.size() == 0){
            st.push(ele);
            return;
        }

        int top = st.pop();
        pushAtBottom(ele);
        st.push(top);
    }

    public static void main(String[] args) {
        st.push(1);
        st.push(2);
        st.push(3);

        pushAtBottom(7);

        while(st.size() != 0){
            System.out.print(st.pop() + " ");
        }
    }
}