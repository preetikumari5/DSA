// printing only one subsequence
#include<bits/stdc++.h>
using namespace std;
bool printS(int i,vector<int> &ds,int s,int sum,int arr[],int n)
{
    if(i==n)
    {
        // if condition satisfied
        if(s==sum)
        {
            for(auto it : ds) cout << it << " ";
            cout<<endl;
            return true;
        }
        // not satisfied
        else return false;
    }
    ds.push_back(arr[i]);
    s += arr[i];
    if(printS(i+1,ds,s,sum,arr,n) == true) {
        return true;
    }

    s -= arr[i];
    ds.pop_back();

    if(printS(i+1,ds,s,sum,arr,n) == true) {
        return true;
    }
}
int main()
{
    int arr[] = {1,2,1};
    int n = 3;
    int sum = 2;
    vector<int> ds;
    printS(0,ds,0,sum,arr,n);
    return 0;
}