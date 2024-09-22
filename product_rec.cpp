// product of digits of a given number

#include<iostream>
using namespace std;

int product(int n)
{
    if(n<10) return n;
    return (n%10) * product(n/10);
}

int main()
{
    int k;
    cin>>k;
    cout<<product(k);
    return 0;
}