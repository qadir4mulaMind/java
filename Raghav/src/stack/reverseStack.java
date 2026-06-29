import java.util.Stack;
class Main {
    
    public static Stack<Integer>reverse(Stack<Integer> st){
        Stack<Integer> st2 = new Stack<>();
        while(st.size() > 0){
            st2.push(st.pop());
        }
        
        return st2;
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
        
        st = reverse(st);
        System.out.println(st);
    }
}
