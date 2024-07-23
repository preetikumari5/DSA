// linear search

#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int k;
    cin>>k;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    cout<<endl;
    int p;
    for(int i=0;i<n;i++)
    {
        if(a[i]==k)
        {
            p=i;
        }
    }
    if(p==-1) cout<<-1;
    else cout<<p;
    return 0;

}