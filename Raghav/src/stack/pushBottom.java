import java.util.Stack;

class Main {
    
    // Changed return type from void to int
    public static void pushAtBottom(Stack<Integer> st, int x){
        Stack<Integer> st2 = new Stack<>();
        
        while(st.size() > 0){
            st2.push(st.pop());
        }
        
        st2.push(x);
        
        while(st2.size() > 0){
            st.push(st2.pop());
        }
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
