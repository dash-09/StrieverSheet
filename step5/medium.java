// Sort Characters by frequency	

// Maximum Nesting Depth of Paranthesis
class Solution{
  public static int depth(String s){
     int count = 0, max = Integer.MIN_VALUE;
     Stack<Character> st = new Stack<>();
    for(int i = 0;i<s.length();i++){
      if(s.charAt(i)=='('){
       st.push('(');
        count++;
        max = Math.max(max,count);
       }else if(s.charAt(i)==')'){
         st.pop();
        count--;
      }      
    }
    return max;
  }
}
// Roman Number to Integer and vice versa
// Implement Atoi	
// Count Number of Substrings	
// Longest Palindromic Substring[Do it without DP]
// Sum of Beauty of all substring	
// Reverse Every Word in A String	 (already done in easy part of this section)
