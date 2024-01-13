// 1) find eleement in sorted array  
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int arr[] = {1,2,3,4,5}; int x = 3;
       int left = 0 ; int right = arr.length ;  int ans = -1;
       while(left<right){
         int mid = (right-left)/2;
         if(arr[mid]==x){
           ans = mid;
           break;
         }else if(arr[mid]>x){
           right = mid-1;
         }else{
           left = mid+1;
         }
       }
       System.out.println(ans);
      
      
  }
}

// 2) implement lower bound 
import java.util.*;

public class Solution {
public static void main (String[] args) {
   
     int arr[] = {1,2,2,3}; int x = 2;
     int left = 0; int right= arr.length;
      int ans = 0;
     while(left<right){
       int mid = (left+right)/2;
       if(arr[mid]>=x){
         ans = mid;
         right = mid-1;
       }else{
         left = mid+1;
       }
     }
     System.out.println(ans);
}

}

// 3) implement upper bound
import java.util.*;

public class Solution {
public static void main (String[] args) {
   
     int arr[] = {1,2,2,3}; int x = 2;
     int left = 0; int right= arr.length;
      int ans = 0;
     while(left<right){
       int mid = (left+right)/2;
       if(arr[mid]>x){
         ans = mid;
         right = mid-1;
       }else{
         left = mid+1;
       }
     }
     System.out.println(ans);
}

}

//  4) search insert position 

