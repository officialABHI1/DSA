// variable Size Sliding Window problem

// Find the count of all subarray whose product is strictly less than k 

import java.util.*;

public class Main {
  
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    int [] arr = {10,2,5,6};
    
    int k = 100;
    
    System.out.println(countSubarrayProductLessK(arr,k));
    
  }
  
  public static int countSubarrayProductLessK(int [] arr, int k){
    
    int curr_prod= 1 , ans =0;
    
    // sum of the first window of size k
    
    int start =0, end =0;
    
    while(end<arr.length && start <=end){
      
      curr_prod *= arr[end]; // grow
      
      while(curr_prod>= k && start<= end){ // start <=end because for k =0 this end will go out of bound
        
        curr_prod /= arr[start];
        start++;
      }
      
      // ans calculation
      
      ans+= (end-start+1);
      
      end++;
    }
    
    return ans;
    
    
  }
  
}