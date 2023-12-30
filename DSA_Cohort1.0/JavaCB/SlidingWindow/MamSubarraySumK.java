// fixed Size Sliding Window problem

// Find the Maximum subarraY Sum of size k 

import java.util.*;

public class Main {
  
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    int [] arr = {2,3,1,1,2,7,9,6,2,3,5};
    
    int k = 3;
    
    System.out.println(maxSubarraySum(arr,k));
    
  }
  
  public static int maxSubarraySum(int [] arr, int k){
    
    int curr_sum = 0 , maxm;
    
    // sum of the first window of size k
    for(int i =0;i<k;i++){
      curr_sum += arr[i];
    }
    
    maxm = curr_sum;
    
    for(int i=k;i<arr.length;i++)
    {
      //grow 
      curr_sum += arr[i];
      
      // shrink
      curr_sum -= arr[i-k];
      
      maxm = Math.max(curr_sum,maxm);
    }
    
    return maxm;
    
    
  }
  
}