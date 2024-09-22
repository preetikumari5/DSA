#include<iostream>
using namespace std;


int reverse(int n,int rev = 0)
{

    if(n==0) return rev;     // while(n>0)
    rev = rev*10 + (n%10);
    return reverse(n/10,rev);
}
int main()
{
    int k;
    cin>>k;
    cout<<reverse(k);
    return 0;
}