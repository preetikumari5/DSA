#include <iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int rev=0;
    int a = n; 
    while(n>0)
    {
        int r = n%10;
        rev= rev*10 + r;
        n  = n/10;
    }
    if(rev==a)
    {
        cout<<rev<<"true";
    }
    else
    {
        cout<<rev<<"false";
    }
    return 0;
}