//  postfix to infix ->

import java.util.*;
public class postfixToInfix {
    public static void main(String[] args) {
        String s = "ab*c+";
        System.out.println(getInfix(s));
    }

    public static String getInfix(String s) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length();i++) {
            if (isOperand(s.charAt(i))) {
                st.push(s.charAt(i) + "");
            } else {
                String op1 = st.peek();
                st.pop();
                String op2 = st.peek();
                st.pop();
                st.push("(" + op2 + s.charAt(i) + op1 + ")");
          }
   }
        return st.peek();
}

    public static boolean isOperand(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
}
    
}