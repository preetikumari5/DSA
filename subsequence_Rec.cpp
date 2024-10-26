#include<bits/stdc++.h>
using namespace std;
void subseq(int index , vector<int> &ds , int arr[],int n)
{
    if(index==n)
    {
        for(auto it:ds){
            cout <<it << " ";
        }
        if(ds.size()==0)
        {
            cout<<"{}";
        }
        cout<<endl;
        return;
    }
    subseq(index+1,ds,arr,n);
    // take the particular index into subsequence
    ds.push_back(arr[index]);
    subseq(index+1,ds,arr,n);

    // not take index element in the subsequence
    ds.pop_back();
    // order reverse 
    // subseq(index+1,ds,arr,n);
}

int main()
{
    int arr[] = {3,1,2};
    int n = 3;
    vector<int> ds;
    subseq(0,ds,arr,n);
    return 0;
}