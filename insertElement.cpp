// leetcode 35

#include<bits/stdc++.h>
using namespace std;

int main()
{
    vector<int> a{1,3,5,6};
    int l = a.size();
    int k;
    cin>>k;
    int p;
    
    for(int i=0;i<l;i++)
    {
        if(a[i]==k) p=i;
        else if(a[l-1]<k) p=l;
        else if(i<l-1 && (a[i]<k && a[i+1]>k)) p = i+1;
    }
    cout<<p;
    return 0;
}