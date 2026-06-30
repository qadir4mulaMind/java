import java.util.Stack;

class Main {
    
    public static String removeConsecutiveCharacter(String s){
        // Handeling null or single length string
        if(s == null || s.length() <= 1) return s;
        
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        
        // putting unique character into stack
        for(int i = 1; i < s.length(); i++){
            if(st.peek() != s.charAt(i)) st.push(s.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        
        char[] x = new char[st.size()];
        for(int i = st.size() -1; i >= 0; i--){
            x[i] = st.pop();
        }
        
        return new String(x);
    }
    
    public static void main(String[] args) {
        String s = "aabbccaaaacccbbbbb";
        String result = removeConsecutiveCharacter(s);
        
        System.out.println(result);
    }
}
