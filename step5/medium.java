// Sort Characters by frequency	

class Solution {
    public String frequencySort(String s) {

        /*
          Map<Character, Integer> map = new HashMap<>();
          for (int i = 0; i < s.length(); i++) {
          map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
          }
          
          PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->
          b.getValue()-a.getValue());
          pq.addAll(map.entrySet());
          StringBuilder sb = new StringBuilder();
          while(!pq.isEmpty()){
          Map.Entry e = pq.poll();
          for(int i = 0;i<(int)e.getValue();i++){
          sb.append(e.getKey());
          }
          
          }
          return sb.toString();
         */

        Map<Character, Integer> map = new HashMap<>();
         for (int i = 0; i < s.length(); i++) {
          map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
          }

        List<Character>[] list = new ArrayList[s.length()+1];
          for(Character ch : map.keySet()){
              int charr= map.get(ch);
              if(list[charr]==null){
                  list[charr] = new ArrayList<>();
              }
              list[charr].add(ch);
          }

          StringBuilder sb = new StringBuilder();

          for(int i = list.length-1;i>=0;i--){
              if(list[i]!=null){
                  for(char ch: list[i]){
                      for(int j = 0;j<map.get(ch);j++){
                          sb.append(ch);
                      }
                  }
              }
              
          }
              
return sb.toString();
    }
}

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
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans = 0;

         for(int i = 0;i<s.length();i++){
             if(i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                 ans -= map.get(s.charAt(i));
             }else{
                 ans += map.get(s.charAt(i));
             }
         }
   return ans;
    }
}
// Implement Atoi	
class Solution {
    public int myAtoi(String s) {
        if (s.equals("")) {
            return 0;
        }

        // helper variables
        int res = 0, i = 0, sign = 1;

        // get rid of whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // check for sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            // change if negative, iterate
            if (s.charAt(i++) == '-') {
                sign = -1;
            }
        }

        // now iterate across digits if any (if for the first time we dont have numeric
        // value we return)
        // should only be in range 0-9
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            // check if we will go over the max
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
                if (sign == -1)
                    return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            // updating result
            res = res * 10 + (s.charAt(i++) - '0');
        }
        return sign * res;
    }
}


// Count Number of Substrings	





// Longest Palindromic Substring[Do it without DP]
class Solution {
    public String longestPalindrome(String s) {
        int start = 0 , end = 0;
        for(int i = 0;i<s.length();i++){
            int odd = expand(s,i,i);
            int even = expand(s,i,i+1);
            int len = Math.max(odd,even);
            if(len>end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    int expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;

    }
}



// Sum of Beauty of all substring	



// Reverse Every Word in A String	 (already done in easy part of this section)
