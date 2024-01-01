/*Problem link : https://codeforces.com/contest/412/problem/A*/

/* Greedy/ Simulation problem

 logic : just find the distance of ladder from both extereme's ( Both LefT & right)

   1. Since the ladder can only move 1 mtr left/right in attempt
      we will try to move to either of extremes which is closer to it and 
      iterate over the sequence leftward or rightward depending on the extreme where you are 
*/

#include<bits/stdc++.h>
using namespace std;

void optimalPattern(string s, int n, int k){
  
  int dist_From_Start =k-1;
  int dist_From_End = (s.length()-k);
  
  if(dist_From_Start <= dist_From_End){
    
    while(dist_From_Start--){
      cout<<"LEFT"<<endl;
    }
    
    for(int i=0;i<n;i++){
      
      cout<<"PRINT "<<s[i]<<endl;
      
      if(i!=n-1){
        cout<<"RIGHT"<<endl;
      }
    }
    
  }
  else{
    
    while(dist_From_End--){
      cout<<"RIGHT"<<endl;
    }
    
    for(int i=n-1;i>=0;i--){
      
      cout<<"PRINT "<<s[i]<<endl;
      
      if(i!=0){
        cout<<"LEFT"<<endl;
      }
    }
  }
  
}

int main(){
  
  // int t;
  // cin>>t;
  // while(t--){
    
     int n,k;
     cin>>n>>k;
     
     string s;
     cin>>s;
     
     optimalPattern(s,n,k);
     
  // }
  return 0;
}