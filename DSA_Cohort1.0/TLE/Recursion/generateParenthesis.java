import java.util.*;

public class Main{
  
  public static void main(String args[]){
    
    int n = 3;
    
    generateParenthesis(n,0,0,"");
    
  }
  
  public static void generateParenthesis(int n, int open, int close, String ans,  List<String>arr){

     
       if(open ==n && close == n){
        //System.out.print(ans+" ");
          arr.add(ans);
       }    
    
        if(open> n || close > open)
        {
           return; 
        }
        
        generateParenthesis(3,open+1,close,ans+'(',arr);
        generateParenthesis(3,open,close+1,ans+')',arr);
    
  }
  
}
