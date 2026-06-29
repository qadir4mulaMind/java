import java.util.Stack;

class Main {
    
    // Changed return type from void to int
    public static int get(Stack<Integer> st, int i) {
        // Base Case: Target reached
        if (st.size() == i) {
            return st.peek(); 
        }
        
        // Remove the top item temporarily
        int top = st.pop();
        
        // Pass the result from the deeper recursive call up the chain
        int result = get(st, i);
        
        // Put the item back to preserve the original stack
        st.push(top);
        
        // Return the final result
        return result;
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
        
        // Capture and print the returned value
        int value = get(st, 2);
        System.out.println("Returned value: " + value);
        
        // Verify the stack was not destroyed
        System.out.println("Original Stack: " + st);
    }
}
