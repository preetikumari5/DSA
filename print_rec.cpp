#include<iostream>
using namespace std;
void fn(int i,int n)
{
    if(i>n)
    {
        return;
    }
    cout<<"abc"<<endl;
    fn(i+1,n);
}
int main()
{
    int n;
    cin>>n;
    fn(0,n);
    return 0;
}