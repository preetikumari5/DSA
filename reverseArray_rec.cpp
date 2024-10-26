// reverse an array using recursion

#include<iostream>
using namespace std;
void reverse_arr(int i,int n,int arr[])
{
    if(i>n/2)
    {
        return;
    }
    int temp = arr[i];
    arr[i] = arr[n];
    arr[n] = temp;
    reverse_arr(i+1,n-1,arr);
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<"arr: ";
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    reverse_arr(0,n-1,arr);
    cout<<"rev arr: ";
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;
}