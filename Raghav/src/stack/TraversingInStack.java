import java.util.Stack;
class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
        // remove top element from first stack
        // print top element 
        // push top element into second stack 
        while(st.size() > 0){
            int top = st.pop();
            System.out.println(top);
            st2.push(top);
        }
        
        // remove top element from stack 1 and push it into satck 2 
        while(st2.size() > 0){
            st.push(st2.pop());
        }
    }
}

// 50
// 40
// 30
// 20
// 10
