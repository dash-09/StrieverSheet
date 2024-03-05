// A) infix to postfix conversion

import java.util.*;

class HelloWorld {
      static int Prec(char ch) {
    switch (ch) {
    case '+':
    case '-':
      return 1;

    case '*':
    case '/':
      return 2;

    case '^':
      return 3;
    }
    return -1;
  }
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        int n = s.length();
        System.out.print(infixToPostfix(s,n));
        
    }
    public static String infixToPostfix(String s , int n){
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i = 0 ;i<n;i++){
            char c = s.charAt(i);
            
            if(Character.isLetterOrDigit(c)){
                ans += c;
            }else if(c == '('){
                st.push(c);
            }else if(c==')'){
                while(!st.isEmpty()&& st.peek() !='('){
                   ans += st.pop();
                }
                st.pop();
            }else{
                while(!st.isEmpty() && Prec(c)<=Prec(st.peek())){
                    ans+= st.pop();
                }
                st.push(c);
            }
            
            
        }
            return ans;
    }
}

// b) infix to prefix 





















