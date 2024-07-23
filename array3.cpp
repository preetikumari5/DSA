// ascending order

#include<bits/stdc++.h>
using namespace std;

bool isSorted(int arr[],int n)
{
    for(int i=0;i<n;i++)
    {
        if(arr[i]>arr[i+1])  return false;
    }
    return true;
}

int main()
{
    int n;
    cin>>n;
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
    bool result = isSorted(a,n);
    if(result==1)
    {
        cout<<"true"<<endl;
    }
    else cout<<"false"<<endl;    
    return 0;
}