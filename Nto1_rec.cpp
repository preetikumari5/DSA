#include<iostream>
using namespace std;
int rev_num(int i,int n)
{
    if(i<1)
    {
        return 0;
    }
    cout<<i<<endl;
    return rev_num(i-1,n);
}
int main()
{
    int n;
    cin>>n;
    rev_num(n,n);
    return 0;
}