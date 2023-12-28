/* Problem Link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/J */

#include <iostream>
 
using namespace std;
 
long long fact(long long int n) {
    if (n == 0 or n == 1)
        return 1;
 
    return n * fact(n - 1);
}
 
int main() {
    long long n;
    cin >> n;
    cout << fact(n) << endl;
}