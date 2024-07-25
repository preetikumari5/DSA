// map<num,num ki frequency>

#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }

    // pre compute
    map<int,int> mpp;
    for(int i=0;i<n;i++)
    {
        mpp[a[i]]++;
    }

    // iterate through map
    for(auto it:mpp)
    {
        cout<<it.first<<"->"<<it.second<<endl;
    }

    int q;
    cin>>q;
    while(q--)
    {
        int num;
        cin>>num;
        // fetch
        cout<<mpp[num]<<endl;
    }

    return 0;
}