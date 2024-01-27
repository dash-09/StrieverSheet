// finding square root of a number using binary search
class Solution{
  public static void main(String args[]){
    int n = 36 ;  
    // output = 6 
    int start = 1, end = n-1;
    while(start<=end){
       long mid = (start+end)/2;
       long temp = mid*mid;
      if(temp<=(long)n{
        start = (int)mid+1;     
      }else{ end = (int)mid-1;}
    } 
    System.out.print(high);
  }
}
// find nth root of a number using binary search

// koko eating bananas

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = Integer.MIN_VALUE;
        for(int pile:piles){
            hi = Math.max(hi, pile);
        } 
        while (lo < hi) {
            int K = lo + ((hi - lo) >> 1);
            if (canEatAll(piles, K, h)) {
                hi = K;

            } else {
                lo = K + 1;
            }
        }

        return lo;
    }

    private boolean canEatAll(int[] piles, int K, int H) {
        int countHour = 0;
        for (int pile : piles) {
            countHour += pile / K;
            if (pile % K != 0)
                countHour++;
        }
        return countHour <= H;
    }

}



// minimum days to make M banquates


// brute force approach (time > O(max-min)*arr.length)
  class Solution{
    public static void main(String args[]){
      // edge case 
       if((long)arr.length< (long)m*k)return -1; 
      int arr[] = {7, 7, 7, 7, 13, 11, 12, 7}, m = 2, k = 3; 
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
      for(int i = 0;i<arr.length;i++){
        min = Math.min(arr[i],min);
        max = Math.max(arr[i],max);
      }
             int ans = 0;
      for(int i = min;i<=max;i++){
        if(possible(arr,i,m,k){
          ans = i;
          break;
        }
      }
      System.out.print(ans);
      
    }
    public static boolean possible(int arr[], int day, int m, int k){
         int count = 0 , numberBq = 0;
      for(int i = 0;i<arr.length;i++){
        if(arr[i]<=day){count++;}
        else{
          numberBq += count/k;
          count = 0;
        } 
      }
      numberBq += count/k;
      return numberBq>=k;
    }
  }


//  better approach using binary search 

class solution{
  public static int Ba(int arr[], int m , int k){
      if((long)arr.length < (long)m*k){
        return -1;
      }
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
      for(int i = 0;i<arr.length;i++){
        min = Math.min(arr[i],min);
        max = Math.max(arr[i],max);
      }

       while(min<=max){
         int mid = (min+max)>>1;
         if(possible(arr,mid, m, k){
           max = mid-1;
         }else{
           min = mid+1;
         }
       }
    return min;
  }
  public static boolean possible(int arr[], int mid, int m, int k){
      int count = 0,  number = 0;
       for(int i = 0;i<arr.length;i++){
          if(arr[i]<=mid){count++;}
         else{
           number+=count/k;
            count = 0;
             }
       }
     number += count/k;
    return number>=m;
  }
}





// find a smallest divisor
      class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, nums[i]);
        }

        int min = 1;
        while (min <= max) {
            int mid = (max + min) >> 1;
            if (possible(nums, mid, threshold)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;

    }

    public static boolean possible(int arr[], int mid, int limit) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double) arr[i] / (double) mid);
        }
        return sum <= limit;
    }
}
// capacity to ship packages within D days
// kth missing positive number 
// aggresive cows 
// book allocation problem
// split array
// painter's problem
// minimise maximum distance to gas station
// median of 2 sorted arrays
// kth element of two sorted arrays  
