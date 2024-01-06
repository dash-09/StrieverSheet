
 // selection sort 

/*
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;
           int max = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
             int k = 0;
            for(int j = i;j<arr.length;j++){
               if(max>arr[j]){
                   max = arr[j];
                   k = j;
               }
            }
           
            int temp = max; 
            arr[k] = arr[i];
            arr[i] = temp;
            max = Integer.MAX_VALUE ;
        }
        
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
} 

*/


// bubble sort 

/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int arr[] = {13,46,24,52,20,9}; int n = arr.length;
         int k = n;
        for(int i = 0;i<n;i++){
            for(int j = 1;j<k;j++){
                if(arr[j]<arr[j-1]){
                    int tmep = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmep;
                }
            }
            k--;
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
         
    }
}

*/

// insertion sort

/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int arr[] = {13,46,24,52,20,9}; int n = arr.length;
          int  j = 0;
        for(int i = 1;i<n;i++){
           j = i;
            while(j>0 && arr[j] <arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
      
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
}
*/

// merge sort 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*
import java.util.*;
class HelloWorld {
    public static void main(String[] args) { 
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        mergesort(arr,0,n-1);
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void mergesort(int arr[], int low, int high){
        if(low>=high)return;
        int mid = (low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[], int low , int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
         int left = low;
         int right = mid+1;
         while(left<=mid&& right<=high){
             if(arr[left]<=arr[right]){
                 list.add(arr[left]);
                 left++;
             }else{
                 list.add(arr[right]);
                 right++;
             }
         }
         while(left<=mid){
             list.add(arr[left]);
             left++;
         }
         while(right<=high){
             list.add(arr[right]);
             right++;
         }
         
         for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
        
    }
}
*/

// recursive bubble sort 

/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
       int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        sort(arr,n);
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
     }
     public static void sort(int arr[], int n){
         if (n == 0) return;
         for(int i = 1;i<n;i++){
             if(arr[i]<arr[i-1]){
                 int temp = arr[i];
                 arr[i] = arr[i-1];
                 arr[i-1] = temp;
             }
         }
         
         sort(arr,n-1);
     }
     
}
*/
// recursive insertion sort 
/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
       int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        sort(arr,0,n);
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
     }
     public static void sort(int arr[], int i,int n){
         if ( i ==n ) return;
         int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
         
         sort(arr,i+1,n);
     }
     
}
*/

// Quick sort (remain)












