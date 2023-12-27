/* Problem Link: *https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/D /

/* Take care of edge case N == 0 in the main function itself */

import java.util.*;

public class Main{
  
  public static void main(String args[]){
    
     Scanner sc = new Scanner(System.in);
     
     int t = sc.nextInt();
     
     while(t-->0){
        
        long n = sc.nextInt();
        
        if(n==0){
          System.out.println("0");
        }
        else{
           printDigits(n);
           System.out.println();
        }
    
     }
  }
  
  public static void printDigits(long n){
    
    if(n<=0){
      return ;
    }
  
    printDigits(n/10);
    System.out.print(n%10+" ");
    
  }
  
  
}