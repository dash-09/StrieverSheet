
// Remove outermost Paranthesis	
class Solution {
    public String removeOuterParentheses(String s) {        
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(st.size()>0){
                    sb.append(ch);
                }
                st.push(ch);
            }else{
                st.pop();
                if(st.size()>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
// Reverse Words in a String
class Solution {
    public String reverseWords(String s) {

        // String []str = s.trim().split("\\s+");

        // String out = "";

        // for(int i = str.length-1;i>0;i--){
        // out += str[i] + " ";
        // }
        // return out+ str[0];

        ArrayList<String> list = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            String st = "";
            while (i < s.length() && s.charAt(i) != ' ') {
                st += s.charAt(i);
                i++;
            }
            
            if (st != "") {
                list.add(st);
            }

        }

        String asn = "";
        for (int j = list.size() - 1; j > 0; --j) {
            asn += list.get(j) + " ";
        }
           asn+=list.get(0);
        return asn;

    }
}
// Largest odd number in a string	
class Solution {
    public String largestOddNumber(String num) {

        char ch = num.charAt(num.length() - 1);
        int x = Character.getNumericValue(ch);
        int j = num.length() - 1;
        String s = num;
        if (x % 2 == 1)
            return num;
        else {
            while (j > 0) {
                while (j > 0 && (s.charAt(j) == '0' || s.charAt(j) == '4' || s.charAt(j) == '6' || s.charAt(j) == '8'
                        || s.charAt(j) == '2')) {
                    j--;
                }
                if (j > 0 && (s.charAt(j) == '1' || s.charAt(j) == '3' || s.charAt(j) == '5' || s.charAt(j) == '7'
                        || s.charAt(j) == '9')) {
                    break;
                }
            }

        }

        if (s.charAt(j) == '0' || s.charAt(j) == '4' || s.charAt(j) == '6' || s.charAt(j) == '8'
                || s.charAt(j) == '2') {
            return "";
        }
        return s.substring(0, j + 1);
    }
}
//  Longest Common Prefix	
class Solution {
    public String longestCommonPrefix(String[] strs) {
      
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
          String x = strs[0];
          String y = strs[strs.length-1];
            int i = 0;

        while(i<x.length()&& i<y.length()){
            if(x.charAt(i)==y.charAt(i)){
                sb.append(x.charAt(i));
                i++;
            }else{
                break;
            }


        }
    return sb.toString();
    }
}



// Isomorphic String	

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            char c1 = s.charAt(i); char c2 = t.charAt(i);
            if(map1.containsKey(c1)==true){
                if(map1.get(c1)!= c2){
                    return false;
                }
            }else{
                if(map2.containsKey(c2)==true){
                    return false;
                }else{
                    map1.put(c1,c2);
                    map2.put(c2,true);
                }
            } 

        }
        return true;
    }
}


// check whether one string is a rotated or not
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;

        if(s.length()==goal.length() && (s+s).contains(goal)){
            return true;
        }else{
            return false;
        }
    
       
    }
}
// Check if two Strings are anagrams of each other
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int ch1[] = new int[26];
        int ch2[] = new int[26];

        for (char ch : s.toCharArray()) {
            ch1[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            ch2[ch - 'a']++;
        }

        if(Arrays.equals(ch1,ch2))return true;
        return false;

    }
}
