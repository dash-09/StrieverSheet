// 1: largest element in arrray 
/*
class Solution{
public static void main(String args[]){

int arr[] = {2,5,1,3,0};  int n = arr.length;
int max = arr[0];
 for(int i = 1;i<n;i++){
      if(max<arr[i]){
   max = arr[i];
}
}
System.out.print(max);
}
}

*/

// second largest and smallest element 

/*
class Solution{
   public static void main(String args[] ){
      int arr[] = {11,9,10,2,4,7,7,5,11,12,34,66};
      int n = arr.length;
       int l = Integer.MIN_VALUE;
       int ll = Integer.MIN_VALUE;
       int s = Integer.MAX_VALUE;     
       int ss = Integer.MAX_VALUE;     
       for(int i = 0;i<n;i++){
           if(arr[i]>l){
               ll = l;
               l = arr[i];
           }else if(arr[i]>ll&& arr[i]!= l){
               ll = arr[i];
           }
           
           if(arr[i]<s){
               ss = s;
               s = arr[i];
           }else if(arr[i]<ss && arr[i]!= s){
               ss = arr[i];
           }
       }
       
       
       System.out.println(ss);
       System.out.println(ll);
       
}
}

*/
// 3: check if array is sorted 

/*
class Solution{
 public static void main(String [] args){
    
int arr[] = {2,5,1,3,0};  int n = arr.length;
for(int i = 1;i<n;i++){
 if(arr[i]<arr[i-1]){
  System.out.print("false");
break;
}
}
System.out.print("done");


} 
}
*/

// 4: remove duplicates in place from sorted array 


/*
class Solution{
 public static void main(String args[]){
      int arr[] = {1,1,2,2,2,3,3};
     int n = 0;  int j = 0;
  
      for(int i = 1;i<n;i++){
         if(arr[j] !=arr[i]){
      arr[j] = arr[i-1];
  j++; 
}
     }
System.out.print(j);
}

}
*/

// 5: left rotate array by one time 

/*
 
class HelloWorld {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5};
        int temp = arr[0];  int n = arr.length;
       for(int i = 1;i<arr.length;i++){
           arr[i-1] = arr[i];
       }
       arr[arr.length-1] = temp;
       for(int i = 0;i<n;i++){
           System.out.print(arr[i]);
       }
       
    
     }
}
*/


// 6:  left rotate array by D place  
/*

class HelloWorld {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7,8,9};
      int d = 3; int n = arr.length;
      reverse(arr,0, n-1);
      reverse(arr,0,d-1);
      reverse(arr,d,n-1);
       for(int i = 0;i<n;i++){
           System.out.print(arr[i]+",");
       } 
    }
    public static void reverse(int arr[], int start, int end){
        
        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
*/

// 7: move all zeros to end 
/*
class Solution{
 public static void main(String args[]){

   int arr[] = {1,2,0,3,0,4,1,0};
   int n = arr.length;
   int j = -1;
for(int i = 0;i<n;i++){
if(arr[i]==0){
j = i;
break;}}
 
for(int i = j+1;i<n;i++ ){
  if(arr[i]!=0){
      int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
j++;
}
}
  
for(int i = 0;i<n;i++){
System.out.println(arr[i]);
}
}

}
*/
// 8 : Linear search 
/*
class Solution{
public static void main(String args[]){
  int x[] = {1,24,6,1,3,1,9,8,6,5}; int target = 24;
    for(int i = 0;i<x.length;i++){
       if(x[i]== target){
       System.out.print(i);
       break;    
       } 
         }

}}*/

// 9: union of two sorted arrays 
 
 /*

import java.util.*;

public class one {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5 };
        int n = arr1.length, m = arr2.length;
         int i = 0; int j = 0;
         while (i < n && j < m) {
             if (arr1[i] <= arr2[j]) {
                 if (!list.contains(arr1[i])) {
                     list.add(arr1[i]);
                 }
                 i++;
             } else {
                 if (!list.contains(arr2[j])) {
                     list.add(arr2[j]);
                 }
                 j++;

             }
         }
         while (i < n) {
             if (!list.contains(arr1[i])) {
                 list.add(arr1[i]);
             }
             i++;
         }
         while (j < m) {
             if (!list.contains(arr2[j])) {
                 list.add(arr2[j]);
             }
             j++;
         }
System.out.println(list);
    }
}

*/

// 10 : Find the missing number in an array

/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
    int arr[] = {1,2,4,5};
     int n = arr.length;
      int sum = (n*(n+1))/2;
       int x = 0;
     for(int i = 0;i<n-1;i++ ){
         x+= arr[i];
     }
     
     System.out.print(sum-x);


    }
}

*/
// 11:  Count Maximum Consecutive One’s in the array
 
/* 
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1,0,0,0,0,1,1,1,1,1,1,1,1,1};
        int n = arr.length;
         int ones = 0; int max = 0;
         
         for(int i = 0;i<n;i++){
              if(arr[i] == 1){
                  ones++;
                  max = Math.max(max,ones);
              }else{
                  ones = 0;
              }
         }
         System.out.print(max);
 
         
         
    }
}
*/
// 12: Find the number that appears once, and the other numbers twice

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {1,1,2,2,3,4,4};
      int n = arr.length;
       int x = 0;
      for(int i = 0;i<n;i++){
        x = x^arr[i];
        
      }
      System.out.print(x);
      
  }
}
*/

/*question 14 and 13 */

// 13: Longest Subarray with given Sum K(Positives)

/*
 import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        int arr[] = {-1,1,1};
        int n = arr.length;
         int sum = 0; int max = 0;  int k = 1;
         Map<Integer,Integer> map = new HashMap<>();
         for(int i = 0;i<n;i++){
             sum += arr[i];
             if(sum==k){
                 max = Math.max(max,i+1);
             }
             int rem = sum-k;
             if(map.containsKey(rem)){
                 int len = i-map.get(rem);
                 max = Math.max(max,len);
             }
             if(!map.containsKey(sum)){
                 map.put(sum,i);
             }
         }
         System.out.print(max);
        
    }
}
time and space O(N)  
*/

/*



*/



// 14: Longest Subarray with sum K | [Postives and Negatives]
/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        int arr[] = {-1,1,1};
        int n = arr.length;
         int sum = 0; int max = 0;  int k = 1;
         Map<Integer,Integer> map = new HashMap<>();
         for(int i = 0;i<n;i++){
             sum += arr[i];
             if(sum==k){
                 max = Math.max(max,i+1);
             }
             int rem = sum-k;
             if(map.containsKey(rem)){
                 int len = i-map.get(rem);
                 max = Math.max(max,len);
             }
             if(!map.containsKey(sum)){
                 map.put(sum,i);
             }
         }
         System.out.print(max);
        
    }
}

// time complexit y : o(N) and space also O(N)
*/
   


