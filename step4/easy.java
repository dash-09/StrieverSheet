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

// 4) search insert position
 class Solution {
    public int searchInsert(int[] nums, int target) {
         int low = 0;
         int mid = 0;
         int high = nums.length -1 ;
         while(low<= high){
             mid = (low+high)/2 ;
             if(target < nums[mid]){
             high = mid-1 ;
             }else if(target == nums[mid]){
             return mid;
             }else{
                 low = mid+1;
             }
         }
         return low ;
    }
}
// 5) floor/ ceil in sorted array 
// 6) find first and last occurance of a number in sorted array
// 7) count occurances of a number in a sorted array with duplicates
// 8) search in rotated sorted array (i)(no duplicates)
class Solution {
    public int search(int[] nums, int target) {
         int start = 0 ; int end = nums.length -1 ;
        while(start<=end){
            int mid =(start+end)/2 ;
            if(nums[mid] == target){
                return mid ;
            }else if(nums[mid]>= nums[start]){
                if(nums[start] <= target && target < nums[mid]){
                    end = mid-1 ;
                }else{
                    start = mid+1 ;
                }

            }else{
                if(nums[mid]< target && target <= nums[end]){
                    start = mid+1 ;
                }else{
                    end = mid-1 ;
                }
            }
        }
        return -1 ;
    }

}
// 9) search in rotated sorted array (ii)

// 10) find minimum in rotated sorted array 
 class Solution{
     public int findMIn(int nums[]){
         if(nums.length == 0)return 0;
         if(nums.length == 1)return nums[0];
         if(nums.length == 2)return Math.min(nums[0],nums[1]);

    int left = 0, high = Integer.MAX_VALUE;
         while(left<=high){
             if(nums[low]<nums[high]){
               min = Math.min(min,nums[low]);
               break;
             }
             int mid = low+(high-low)/2;
             if(nums[low] <=nums[mid]){
                 min = Math.min(min,nums[low]);
                 low = mid+1;
             }
             else{
               min = Math.min(min,nums[mid]);
                 high = mid-1;
             }
         }
 return min;
     }      
 }
     
// 11) find out how many times array has been rotated
  class solution{
    public static void main(String args[]){
       int arr[] = {4,5,6,7,0,1,2,3}; int n = arr.length;
        if(arr.length == 0) System.out.print(0);
        if(arr.length == 1) System.out.print(0);
         int low = 1; int high = n-2;
         int ans = -10;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<arr[mid-1]&& arr[mid]<arr[mid+1]){
           ans = mid;break;
            }else if(arr[mid]>arr[mid-1]){low = mid+1;}
            else {high = mid-1;}
        }
         
           System.out.print(ans);
        
    }
  }        

// 12) single element in sorted array 
  class solution{
    public int singleElement(int arr[]){
       if(arr.length == 0)return 0;
       if(arr.length == 1)return arr[0];
       if(arr.length == 2)return Math.max(arr[0],arr[1]);
       if(arr[0]!=arr[1])return arr[0];
       if(arr[arr.length-1]!=arr[arr.length-2])return arr[arr.length-1]; 
        int low = 1; int high = arr.length-2;
        while(low<=high){
           int mid = (low+high)/2;
            if(arr[mid]!= arr[mid-1] && arr[mid] != arr[mid+1]){return arr[mid];}
            else if((arr[mid] != arr[mid-1] && mid%2== 0)|| (arr[mid] != arr[mid+1] && mid%2== 1)){low = mid+1;}
            else{high = mid-1;}
        }
        return -1;
    }
  }  
// 13) find peak element
class solution{
    public int peakElement(int arr[]){
       if(arr.length == 0)return 0;
       if(arr.length == 1)return arr[0];
       if(arr.length == 2)return Math.max(arr[0],arr[1]);
       if(arr[0]>arr[1])return arr[0];
       if(arr[arr.length-1]>arr[arr.length-2])return arr[arr.length-1];
      int low = 1; int high = arr.length-2;
       while(low<=high){
          int mid = (low+high)/2;
           if(arr[mid]>arr[mid-1] && arr[mid+1] < arr[mid]){
                return arr[mid];
           }else if(arr[mid]>arr[mid-1]){low = mid+1;}
           else{high = mid-1;}               
       }
        return -1;

    }}

 
