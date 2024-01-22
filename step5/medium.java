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



// Count Number of Substrings	
// Longest Palindromic Substring[Do it without DP]
// Sum of Beauty of all substring	



// Reverse Every Word in A String	 (already done in easy part of this section)
