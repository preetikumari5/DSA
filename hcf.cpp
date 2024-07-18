#include <iostream>
using namespace std;
int main()
{
    int n1,  n2;
    cin>>n1;
    cin>>n2;
    int hcf = 1;
    int l;
    // if(n1>n2) l=n1;
    // else l=n2;
    for(int i=1; i<=min(n1,n2);i++)
    {
        if(n1%i ==0 && n2%i ==0)
        {
            if(i>hcf)
            {
                hcf=i;
            }
        }
    }
    cout<<hcf;
    return 0;
}