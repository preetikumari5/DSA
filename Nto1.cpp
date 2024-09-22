#include <iostream>
using namespace std;

void num(int n)
{
    if(n==1) 
    {
        cout<<1<<endl;
        return;
    }
    cout<<n<<endl;
    num(n-1);
}
int main()
{
    int k;
    cin>>k;
    num(k);
    return 0;
}