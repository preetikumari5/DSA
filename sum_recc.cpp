#include<iostream>
using namespace std;
void print(int n,int sum)
{
    if(n<1)
    {
        cout<<sum;
        return;
    }
    print(n-1,sum+n);
}
int main()
{
    int n;
    cin>>n;
    print(n,0);
    return 0;
}