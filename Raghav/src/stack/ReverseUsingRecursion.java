import java.util.Stack;

class Main {
    public static void get(Stack<Integer> st, int i){

        if (st.size() == i) {
            System.out.println(st.peek());
            return;
        }
        int top = st.pop();
        get(st, i);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); // Index 1 from bottom
        st.push(20); // Index 2 from bottom
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        
        // 3. Fixed the method call format
        get(st, 2);
    }
}
