#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a = n;
    int b =n;
    int c = 0;
    int sum =0;
    while(n>0)
    {
        c = c+1;
        n = n/10;
    }
    while(a>0)
    {
        int ld = a%10;
        sum = sum + pow(ld,c);
        a = a/10;
    }
    if(sum==b)
    {
        cout<<"true";
    }
    else
    {
        cout<<"false";
    }
    return 0;
}

