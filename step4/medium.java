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
// find a smallest divisor
// capacity to ship packages within D days
// kth missing positive number 
// aggresive cows 
// book allocation problem
// split array
// painter's problem
// minimise maximum distance to gas station
// median of 2 sorted arrays
// kth element of two sorted arrays  
