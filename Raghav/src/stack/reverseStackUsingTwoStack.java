import java.util.Stack;
class Main {
    
    public static void reverse(Stack<Integer> st) {
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        
        // Move to st2 (reverses order)
        while(!st.isEmpty()) {
            st2.push(st.pop());
        }
        // Move to st3 (reverses back to original order)
        while(!st2.isEmpty()) {
            st3.push(st2.pop());
        }
        // Move back to st (reverses to final reversed order)
        while(!st3.isEmpty()) {
            st.push(st3.pop());
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
        
        reverse(st);
        System.out.println(st);
    }
}
