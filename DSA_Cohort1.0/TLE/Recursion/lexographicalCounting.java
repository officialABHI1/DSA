import java.util.*;

public class Main{
  
  public static void main(String args[]){
    
    int n = 13;
      List<Integer> arr = new ArrayList<>();
     generateLexographicalNumbers(0,n,arr);
     System.out.print(arr);
    
  }
  
  public static void generateLexographicalNumbers(int curr, int n, List<Integer> arr){
    
    //base case
    if(curr>n){
      return;
    }
    
    arr.add(curr);
    
    int i=0;
    
    if(curr==0){
      i =1;
    }
    
    for(;i<=9;i++)
    {
      generateLexographicalNumbers(curr*10+i,n,arr);
    }

  }
  
}
