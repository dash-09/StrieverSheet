
// 2 sum problem : 

class Solution {
    public int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> map = new HashMap<>();
    int arr[] = new int[2];
            int n = nums.length;
            
    for(int i = 0;i<n;i++){
        if(map.containsKey(target-nums[i])){
            arr[1] = i;
            arr[0] = map.get(target-nums[i]);
            return arr;

        }
        map.put(nums[i],i);
    }

return arr;

    }
}

// sort 0,1,2  using switch case  

 class solution{
  public static void sortIt(int arr[]){
     int n = arr.length;   
    int low = 0, mid = 0, high = n-1;
     
      while(low<=high){

               switch(arr[mid]){

                case 0:{
          int temp = arr[low];
           arr[low] = arr[mid];
             arr[mid] = temp;
               mid++; low++;
            break;
            }

             case 1:{
                mid++;
         break;           
           }
               
            case 2:{
                int temp = arr[mid];
                 arr[mid] = arr[high];
                  arr[high] = temp;
                     high--;
                    break;  
             }

          }
           
       }
    
   }
}


// majority element (N/2< )


class solution{
public static void majorityElement(int arr[]){

         int n = arr.length;
         int major = 0; int count = 0;
for(int i = 0;i<n;i++){
      if(count == 0){
       major = arr[i];  count = 1;
}else if(major == arr[i]){
        count++; 
} else{
      count--;
 }
   
}

return major;
}}

//  kadens algorithm (this algo tells the subarray which has the maximum sum)

/*

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
 
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};  int n = arr.length;
        int max1 = Integer.MIN_VALUE; int max2 = Integer.MIN_VALUE; 
        int sum = 0;
        
        
    /*    for(int i = 0;i<n;i++){
            int s = 0;
            for(int j = i;j<n;j++){
                s = s+arr[j];
                max1 = Math.max(s,max1);
            }
        }
        
        System.out.print(max1);
   // brute force >> time n^2    
*/  
   
/*     
        for(int i = 0;i<n;i++){
            sum+=arr[i];
            if(sum>max2){
                max2 = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
          System.out.println();
          System.out.println();
          System.out.println(max2);
     }
}

// best approach kadens algorithm (time >O(n^2))
*/


    class solution{
         public static void main(String args[]){
              int arr[] = {7,1,5,3,6,4};
                int n = arr.length;    

               int min = Integer.MAX_VALUE;
               int max = Integer.MIN_VALUE;

                 
             for(int i = 0;i<n;i++){

                    min = Math.min(min,arr[i]);
                    max = Math.max(max,arr[i]-min);
           }  
 
                    
                 
 } 

   }


// Rearrange element by sign 

class Solution {
    public int[] rearrangeArray(int[] nums) {

       int odd = 1;
       int even = 0;
        int ans[] = new int[nums.length]; 
       for(int i = 0;i<nums.length;i++){
                 if(nums[i]<0){
                    ans[odd] = nums[i]; odd= odd+2;   
                 }else{
                     ans[even] = nums[i];
                     even = even+2;
                 }

       } 
      return ans;
    }
}


// next permutation 
 

 class Solution{
          public static void main(String args[]){

          
       int arr[] = {1,3,2};  int n = arr.length;  
         int i ;
         for(i = n-2;i>=0;--i){
            if(arr[i]<arr[i+1]){
            break;
      }            
       }
 
    if(i>=0){
        for(int j = n-1;j>i;--j){
          if(nums[j]>nums[i]){
       swap(arr,i,j);
  break;
}
     }
         
    }

 reverse(arr,i+1,n-1); 



 }
public static void swap(int arr[], int i, int j){
   int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;}
    
  public static void reverse(int arr[], int i, int j){
        while(i<j){
             int temp = arr[i];
                arr[i] = arr[j] ;
                arr[j] = temp;
                   i++; j--; 
          }
      }
       }




//  Leader in array 

  class solution{
             
  public static void main(String args[]){

           List<Integer> list = new ArrayList<>();
            int n = arr.length;
               int max = arr[n-1]; list.add(arr[n-1]);
         for(int i = n-2;i>=n-2;--i){
                 if(arr[i]>max){list.add(arr[i]); max = arr[i];}
             }

return list;
}

 }



// longest consecutive sequence 

 class solution{
    public static void main(String args[]){
 
         int arr[] = {100, 200, 1, 3, 2, 4}; int n = arr.length; 
          Arrays.sort(arr); int lastsmaller = Integer.MIN_VALUE; int cnt = 0; int longest = 1;
              for(int i =0;i<n;i++){
                        if(arr[i]-1 == lastsmaller){
                         cnt+=1; lastsmaller = arr[i];}

                          else if(arr[i]!= lastsmaller){
                        cnt = 1; lastsmaller = arr[i];}
           longest = Math.max(longest , cnt);
}
return longest;

// time complexity >  O(nlogn) + O(N)  
//  space complexity > O(1)  
 } 
 }



                    // 2 solutions  

class solution{
 public static void main(String args[]){
   int arr[] = {100, 200, 1, 3, 2, 4}; int n = arr.length;   int max = Integer.MIN_VALUE;
Set<Integer> set = new Set<>();  
for(int i = 0;i<n;i++){set.add(arr[i]);}
 int count = 0;
 for(int it:set){
 if(!set.contains(it)){
      int cnt = 0;int x = it;     
        while(set.contains(x)){
        x = x+1; cnt++;}
         max = Math.max(max,cnt); }
}
 return max;
 }} 




// count subarray sum equals  
class solution{
main function(){
 int n = arr.length; 
  Map<Integer,Integer> map = new HashMap<>();
  int sum = 0; int count = 0;
  for(int i =0;i<n;i++){
 sum+=arr[i]; 
 int remove = sum-k;
 count+=map.getOrDefault(remove,0);
  map.put(sum,map.getOrDefault(sum,0)+1);
 }
return count;
}}



















