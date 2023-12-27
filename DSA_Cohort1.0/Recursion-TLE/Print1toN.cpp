/* Problem link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/B */

#include <bits/stdc++.h>
using namespace std;

void print1toN(int n){
  
  // Base case
  if(n<=0){
    return ;
  }
  
  print1toN(n-1);
  cout<<n<<endl;
}

int main() {
    // int t;
    // cin>>t;
    // while(t--){
      int n;
      cin>>n;
      
      print1toN(n);

    //}
    return 0;
}



