import java.util.*;

public class Main{
  
  public static void main(String args[]){
    
    int n =3;
    int m=3;
    
    printGridPaths(0,0,n-1,m-1,"");
    
  }
  
  public static void printGridPaths(int n,int m, int dr, int dc,String ans){
    
    if(n == dr && m == dc){
      System.out.println(ans);
      return;
    }
    
    if(m+1<=dr)
    printGridPaths(n,m+1,dr,dc,ans+'R');
    
    if(n+1<=dc)
    printGridPaths(n+1,m,dr,dc,ans+'D');
    
  }
  
}
