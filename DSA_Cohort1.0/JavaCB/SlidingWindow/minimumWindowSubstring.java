/* Problem Link : https://leetcode.com/problems/minimum-window-substring/submissions/1132146821/ */

// varible Size Sliding Window problem

// Find the minimum Size substring in s such that all the characters in t (including duplicates)
// in the substring in of s

import java.util.*;

public class Main {
  
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    String s = "ADOBECODEBANC";
    String t = "ABC";
    
     System.out.print(minimumWindowSubstring(s,t));
    
  }
  
  public static String minimumWindowSubstring(String s, String t){
    
    int [] freqt = new int[256];
    
    for(int i=0;i<t.length();i++){
      char ch =t.charAt(i);
      freqt[ch]++; // 
    }
    
    int si=0,ei =0;
    
    int start_Index =-1;
    int len = Integer.MAX_VALUE;
    int count =0;
    
    int [] freqs = new int[256];
    
    while(ei<s.length()){
       //grow
       
       char ch = s.charAt(ei);
       freqs[ch]++;
       
       if(freqs[ch]<=freqt[ch]){
         count++;
       }
       
       if(t.length()==count){
         // shrink
         
         while(freqs[s.charAt(si)]>freqt[s.charAt(si)]){
           freqs[s.charAt(si)]--;
           si++;
         }
         
         //ans
         
         if(len > ei-si+1){
           len = ei-si+1;
           start_Index = si;
         }
       }
       
       ei++;
      
    }
    
    if(start_Index== -1){
         return "";
       }
       
       return s.substring(start_Index, start_Index+len );
  }
  
}

