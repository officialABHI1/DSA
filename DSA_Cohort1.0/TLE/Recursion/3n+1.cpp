/* 
  Collatz Conjecture [3N+1 Problem] (No one has ever been able to prove this problem yet)

  It says if we a number n we will follow two rules 

  if n is odd : n -> 3*n+1
   else      :  n/2 

   Result : All of this n ( have been checkep upto 2^68 until now...) sequence will eventually terminate to 1 -2 -4 cycle/loop

   Ex: 7 -> 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4->2 -> 1
*/

/*
   If we try to solve this problem through recusion we can clearly see that base case is simple if n =1 terminate it

*/

/*--------------------------------------------------*/

// to print the length of the Collatz sequence for any n

#include <bits/stdc++.h>
using namespace std;

long long int collatz(long long int n){
   
   long long int count  =0; 
   // base case
   if(n==1){
     //cout<<"1"<<endl;
     //count++;
     return count ;
   }
   
   //cout<<n<<" ";
   
   if(n&1) // check if n is odd
   {
    count+=collatz(3*n+1)+1;
   }
   else
   {
     count+=collatz(n/2)+1;
   }
   
   return count;
}

int main() {
    // int t;
    // cin>>t;
    // while(t--){
      long long int n;
      cin>>n;
      
      cout<<collatz(n)+1<<endl;

    //}
    return 0;
}


/*--------------------------------------------------*/

/*--------------------------------------------------*/

// to print the actual Collatz sequence for any n

#include <bits/stdc++.h>
using namespace std;

long long int collatz(long long int n){
   
   long long int count  =0; 
    //base case
   if(n==1){
     cout<<"1"<<endl;
     return ;
   }
   
   cout<<n<<" ";
   
   if(n&1) // check if n is odd
   {
    collatz(3*n+1);
   }
   else
   {
     collatz(n/2)+1;
   }
   
}

int main() {
    int t;
    cin>>t;
    while(t--){
      long long int n;
      cin>>n;
      
      cout<<collatz(n)+1<<endl;

    }
    return 0;
}


/*--------------------------------------------------*/
