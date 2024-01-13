import java.util.*;

public class Main{
  
  public static void main(String args[]){
    
    String ques = "abc";
    
    generatePermutations(ques,"");
    
  }
  
  public static void  generatePermutations(String ques,String ans){
    
    if(ques.length()==0){
      System.out.println(ans);
      return ;
    }
    
    for(int i=0;i<ques.length();i++){
      
      String s1 = ques.substring(0,i);
      String s2 = ques.substring(i+1);
      
      char ch = ques.charAt(i);
      
      generatePermutations(s1+s2,ans+ch);
      
    }
    
  }
  
}
