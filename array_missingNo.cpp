// missing no. in array

#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,N;
    cin>>n>>N;
    int a[n];
    int sum=0;
    int asum=0;
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    sum = sum + (N*(N+1))/2;
    for(int i=0;i<n;i++)
    {
        asum = asum+a[i];
    }
    cout<<sum<<endl;
    cout<<asum<<endl;
    if(asum!=sum) cout<<sum-asum;
    else cout<<0;
    return 0;
}