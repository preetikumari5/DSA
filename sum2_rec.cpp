// sum of digits of given number

#include<iostream>
using namespace std;

int sumD(int n)
{
    if(n<10) return n;
    return (n%10)  + sumD(n/10);
}

int main()
{
    int k;
    cin>>k;
    cout<<sumD(k);
    return 0;
}