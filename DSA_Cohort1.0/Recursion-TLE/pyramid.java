/* Problem link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/G */

/* Note: The first Two java solution or in general the Java solution can a comparetively a lot
slower than c++ solution, which is why it is c++ is preferred in CP */

/* C++ Accepted Solution */

#include<bits/stdc++.h>
using namespace std;
 
void pyramid(int count, int n){
    
    //base case
    if(count>n){
      return;
    }
    
    //- - -* - - -
    
    int total = 2*n-1;
    int stars = 2*count-1;
    int sp1;
    
    sp1 = (total-stars)/2;
    
    
    //print first spaces
    while(sp1-->0){
     cout<<" ";
    }
    //print stars in the same row
    while(stars-->0){
      cout<<"*";
    }
    
    cout<<endl;
    
    pyramid(count+1,n);
    
  }

int main(){
  
  int n;
  cin>>n;
  
  pyramid(1,n);
}

/* Tle SOL for java With and without FAST I/O in Java */

//with 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

public class Main{
  
  static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader( 
                new InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() { return Integer.parseInt(next()); } 
  
        long nextLong() { return Long.parseLong(next()); } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try { 
                if(st.hasMoreTokens()){ 
                    str = st.nextToken("\n"); 
                } 
                else{ 
                    str = br.readLine(); 
                } 
            } 
            catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 

  public static void main(String args[]){

   FastReader sc = new FastReader();

   int n = sc.nextInt();
   
   pyramid(1,n);

  }
  
  public static void pyramid(int count, int n){
    
    //base case
    if(count>n){
      return;
    }
    
    int stars = 2*count-1;
    
    //print leading spaces
    for(int i=0; i<n-count; i++){
      System.out.print(" ");
    }
    
    //print stars in the same row
    while(stars-->0){
      System.out.print("*");
    }
    
    System.out.println();
    
    pyramid(count+1,n);
    
  }
  
}

// without 

import java.util.*;

public class Main{

  public static void main(String args[]){

   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   
   pyramid(1,n);

  }

  public static void pyramid(int count, int n){
    
    //base case
    if(count>n){
      return;
    }
    
    int total = 2*n-1;
    int stars = 2*count-1;
    int sp1, sp2;
    
    sp1 = (total-stars)/2;
    sp2=sp1;
    
    //print first spaces
    while(sp1-->0){
      System.out.print(" ");
    }
    //print stars in the same row
    while(stars-->0){
      System.out.print("*");
    }
    //print rest spaces
    // while(sp2-->0){
    //   System.out.print(" ");
    // }
    
    System.out.println();
    
    pyramid(count+1,n);
    
  }
}

// Java solution that got accepted due to very less Print statements

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
    
    pyramid(count+1,n,sb);
    
  }
  
}


