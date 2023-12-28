/* Problem Link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/F */

/* Note: Initially in the recursive call for the index in the func, i wrote 2*index which will not work as
 i am passing 0 as initial index which will be 0 always after getting multipled by 2 */

import java.util.*;

public class Main{

  public static void main(String args[]){

   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();

   long [] arr = new long[n];

   for(int i=0;i<n;i++){
     arr[i] = sc.nextLong();
   }

   printEvenElements(arr, 0);

  }

  public static void printEvenElements(long []arr, int index){
    
    if(index >= arr.length){
       return;
    }

    printEvenElements(arr, index+2); 
    
    System.out.print(arr[index] + " ");

  }
}
