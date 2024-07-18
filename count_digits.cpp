#include <iostream>
using namespace std;
int main()
{
    int N;
    cin>>N;
    int count = 0;
    while (N>0)
    {
        count = count+1;
        N = N/10;
    }
    cout<<count;
    return 0;
}