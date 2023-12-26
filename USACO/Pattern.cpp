#include <iostream>
using namespace std;
int main() {

   //------------Pattern Printing----------

    for(int i=5 ;i>=1;i--)
    {
         int j=i ,p=0;

         while(j>0)
         {
             char ch =char(p+65);

             cout<<ch<<" ";
             j--;
             p++;
         }
        
        j=i , p=i-1;
        while(j>0)
         {
             char ch =char(p+65);

             cout<<ch<<" ";
             j--;
             p--;
         }                
         cout<<endl;
    }

}
