// sum of digits of given number

#include<iostream>
using namespace std;

int sumD(int n)
{
    int sum = 0;
    if(n<10) return n;
    while(n>0)
    {
        int d = n%10;
        sum = sum + d;
        n = n/10;
    }
    return sum;
}

int main()
{
    int k;
    cin>>k;
    cout<<sumD(k);
    return 0;
}