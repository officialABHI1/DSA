/*Problem link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/C*/
import java.util.*;

public class Main{
  
  public static void main(String args[]){
       
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
     printNto1(n);
    
  }
  
  public static void printNto1(int n){
  
    // Base case
    if(n<=0){
      return ;
    }
    if(n==1){ // to avoid trailing space at the end
     System.out.print(n);
     printNto1(n-1);  
    }
    else{
     System.out.print(n+" ");
     printNto1(n-1);
    }
    
  }
};




