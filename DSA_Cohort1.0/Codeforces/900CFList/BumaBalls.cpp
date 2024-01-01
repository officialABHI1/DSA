//* Problem Link: https://codeforces.com/contest/1267/problem/B */

// Brute force 

#include<bits/stdc++.h>
using namespace std;

//function to check if the given string can be completely eliminated or not
bool canBeEliminated(string z, int index){
  
  int n = z.length();
  
  bool changes = true;
  
  while(changes){
    changes = false;
    
    for(int i = 0; i < n; ++i){
      int j = i;
      
      // Find the segment of balls of the same color
      while(j < n && z[j] == z[i]){
        ++j;
      }
      
      // If the segment length is at least 3 and contains the inserted ball, eliminate it
      if(j - i >= 3 && i <= index && index < j){
        z.erase(i, j-i);
        changes = true;
        
        if(i>z.length()-1){
          index = -1;
        }
        else
        {
          index = i;
        }
        
        cout<<"i before the index was updated"<<" "<<i<<endl;
        cout<<"index"<<" "<<index<<endl;
        cout<<z<<endl;
        break;
      }
      
      i = j - 1;
      
    }
  }
  
  // If all balls are eliminated, return true
  if(z.empty()){
    return true;
  }
  
  // Otherwise, return false
  return false;
}


string insertIthPosition( string s, char ch, int index){
  
   s.insert(index,1,ch);
   
   return s;
}

int numberWaysEliminate(string s){
 
  // first get all the distinct characters from the string
  int count =0;
  set<char>st;
  
  for(int i=0;i<s.length();i++){
    st.insert(s[i]);
  }
  
  string z ="";
  for(auto x:st){
    for(int i=0;i<=s.length();i++){
      z = insertIthPosition(s,x,i);
       // cout<<z<<endl;
        if(canBeEliminated(z,i)){
          // cout<<"i"<<" "<<i<<endl;
          // cout<<"char"<<" "<<x<<endl;
          count++;
        }
    }
  }
  
  return count;
}

int main(){
  
  int t;
  cin>>t;
  while(t--)
  {
    string s;
    cin>>s;
    
    //s.erase(5,7-5+1);
   //cout<<s<<endl;
   
   cout<<numberWaysEliminate(s)<<endl;
  }
  
  return 0;
}


/* O(n) solution accepted on CF  */

/*

 obs 1 : there should odd no of continous segments of balls otherwise ans = 0
    E.x:   S = BBWWBB = [[ B,2], [W,2],[B,2]] odd no od cont. segement 

    if no of odd segments are there:

       obs 2: mid(seg_value)>1 && seg[mid-i]  && seg[mid +i] should of same color and their combined value should be atlest 3 
        the above fact has to be true fir all the segment on the left and right of the mid segment
    else : ANS =0
          
*/
#include<bits/stdc++.h>
using namespace std;

int numberOfWays(string s){
  
  int i=0,j;
  
  vector<pair<char,int>>v;
  
  while(i<s.length()){
     j = i;
    
    while(s[j]==s[i] && j<=s.length()){
      j++;
    }
    
    v.push_back({s[i],(j-i)});
    
    i=j;
  }
  
  // for(auto x: v){
  //   cout<<x.first<<" "<<x.second<<endl;
  // }
  
  if(v.size()%2==0){
    //cout<<"Hello4"<<endl;
    return 0;
  }
  else{
    
    int m = v.size(),x,y;
    
    if(v[m/2].second >1){
      
      x=m/2-1;
      y=m/2+1;
      
      while(x>=0 && y<=m){
        
        if(v[x].first == v[y].first && v[x].second+v[y].second>=3 )
          x--;
          y++;
      }
      
      if(x ==-1 && y==m ){
        //cout<<"Hello2"<<endl;
        return v[m/2].second+1;
      }
      else
      {
        //cout<<"Hello1"<<endl;
         return 0;
      }
    }
    else
    {
     // cout<<"Hello"<<endl;
      return 0;
    }
  }
}

int main(){
  
  // int t;
  // cin>>t;
  // while(t--){
    
    string s;
    cin>>s;
    
    cout<<numberOfWays(s)<<endl;
  
 // }
  return 0;
}