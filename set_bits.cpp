#include <iostream>
using namespace std;
int main() {
    
   // Program to count the set bits in a number 

   int n;
   cin>>n;
   
   int cnt=0;
   while(n)
   {
      n= n&(n-1);
      cnt++;
   }


   cout<<cnt<<endl;
    
}
