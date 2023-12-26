#include <iostream>
using namespace std;
int main() {

  
  // End of file program 
   char ch;
 

   int cntupp=0 , cntlow=0;
   while(!cin.eof( ))
   {
        cin>>ch;

        int k = (int)ch;

        cout<<k<<" "<<endl;

        if(k>=65 && k<=90)
        {
            cntupp++;
        }
        else
        {
            cntlow++;
        }
   }
  

   cntlow--;
   cout<<cntlow<<" "<<cntupp;

}
