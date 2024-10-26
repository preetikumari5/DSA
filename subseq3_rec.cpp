// count number of subsequnces

#include<bits/stdc++.h>
using namespace std;
int  printS(int i,int s,int sum,int arr[],int n)
{
    if(i==n)
    {
        // if condition satisfied
        if(s==sum)
        {
            return 1;
        }
        // not satisfied
        else return 0;
    }
    
    s += arr[i];
    int l = printS(i+1,s,sum,arr,n);

    s -= arr[i];
    int r = printS(i+1,s,sum,arr,n);

    return l+r;
}
int main()
{
    int arr[] = {1,2,1};
    int n = 3;
    int sum = 2;
    cout<<printS(0,0,sum,arr,n);
    return 0;
}