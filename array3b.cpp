// leetcode 1752

#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,k;
    cin>>n;
    int count=0;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]>a[(i+1)%n]) count++;
    }
    if(count==1) cout<<"true";
    else cout<<"false";
    return 0;
}