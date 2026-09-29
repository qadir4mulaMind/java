package stack;

import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args){

    }
    public boolean isBalanced(String s) {
        int n = s.length();
        if(n % 2 == 1) return false;

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;

                char top = st.peek();

                if(!sameStyle(top, ch)) return false;

                st.pop();
            }
        }
        return st.isEmpty();
    }
    static boolean sameStyle(char a, char b){
        if(a == '(' && b == ')') return true;
        if(a == '[' && b == ']') return true;
        if(a == '{' && b == '}') return true;
        return true;
    }
}