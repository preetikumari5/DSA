//  rotated array

#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,k;
    cin>>n;
    cin>>k;
    int a[n];
    int b[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"original array: ";
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    cout<<endl;
    for(int i=0;i<n;i++)
    {
        b[(i+k)%n]=a[i];
    }
    cout<<"roated array: ";
    for(int i=0;i<n;i++)
    {
        cout<<b[i]<<" ";
    }
    return 0;
}