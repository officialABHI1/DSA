/* Problem Link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/H */

import java.util.*;

public class Main{

  public static void main(String args[]){

   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   
   StringBuilder sb = new StringBuilder();
   
   pyramid(1,n,sb);
   
   System.out.print(sb.toString());

  }
  
  public static void pyramid(int count, int n, StringBuilder sb){
    
    //base case
    if(count>n){
      return;
    }
    
    pyramid(count+1,n,sb);
    
    int stars = 2*count-1;
    
    //print leading spaces
    for(int i=0; i<n-count; i++){
      sb.append(" ");
    }
    
    //print stars in the same row
    while(stars-->0){
      sb.append("*");
    }
    
    sb.append("\n");
    
    
    
  }
  
}
