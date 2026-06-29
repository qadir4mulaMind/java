import java.util.Stack;

class Main {
    
    // Changed return type from void to int
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size() == 0){
            st.push(x); 
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); 
        st.push(20); 
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        
        pushAtBottom(st, 3);
        System.out.println(st);
    }
}
