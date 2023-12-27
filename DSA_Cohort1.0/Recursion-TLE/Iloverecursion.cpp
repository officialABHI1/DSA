/* Problem link: */

#include <bits/stdc++.h>
using namespace std;

void printRecursion(int n){
  
  // Base case
  if(n<=0){
    return;
  }
  
  cout<<"I love Recursion"<<endl;
  printRecursion(n-1);
}

int main() {
    // int t;
    // cin>>t;
    // while(t--){
      int n;
      cin>>n;
      
      printRecursion(n);

    //}
    return 0;
}
