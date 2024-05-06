// postfix to prefix 
import java.util.*;
public class postfixToPrefix {
    public static void main(String[] args) {
        String s = "ABC/-AK/L-*";
        System.out.println(converted(s));
    }
    public static String converted(String s) {

        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (isOperand(s.charAt(i))) {
                String op1 = st.peek();
                st.pop();
                String op2 = st.peek();
                st.pop();
                String temp = s.charAt(i) + op2 + op1;
                st.push(temp);
            } else {
                st.push(s.charAt(i) + "");
            }
        }
        String ans = "";
        for (String i : st) {
            ans += i;
        }
        return ans;
    }
    public static boolean isOperand(char x) {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
   }
       
}

