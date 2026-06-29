import java.util.Stack;
class Main {
    
    public static int get(int i, Stack<Integer> st){
        Stack<Integer> st2 = new Stack<>();
        while(st.size() > i + 1){
            st2.push(st.pop());
        }
        
        int x = st.peek();
        while(st2.size() > 0){
            st.push(st2.pop());
        }
        
        return x;
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
        
        System.out.println(get(2, st));
    }
}

// 30
