// union of 2 arrays

#include<iostream>
using namespace std;
int main()
{
    int n,m;
    cin>>n>>m;
    int count =0;
    int a[n],b[m];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int j=0;j<m;j++)
    {
        cin>>b[j];
    }
    for(int i=0;i<max(n,m);i++)
    {
        for(int j=0;j<min(n,m);j++)
        {
            if(a[i]!=b[j] || a[i]==b[j])
            {
                count =  count+1;
            }
        }
    }
    cout<<count;
    return 0;
}