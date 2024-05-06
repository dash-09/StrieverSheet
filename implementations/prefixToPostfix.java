//prefix to postfix 
 import java.util.*;
public class prefixToPostfix {
    public static void main(String[] args) {
        String s = "*-A/BC-/AKL";
        System.out.println(converted(s));
    }
    public static String converted(String s) {
        Stack<String> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (isOperand(s.charAt(i))) {
                String op1 = st.peek();
                st.pop();
                String op2 = st.peek();
                st.pop();
                String temp = op1 + op2 + s.charAt(i);
                st.push(temp);
            } else {
                st.push(s.charAt(i) + "");
            }
        }
        return st.peek();
    }
    public static boolean isOperand(char c) {
        switch (c) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
}
    
}