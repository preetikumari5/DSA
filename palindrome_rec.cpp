
#include<bits/stdc++.h>
using namespace std;
bool ispalindrome(int i,string &s)
{
    if(i>= s.size()/2) return true;
    if(s[i] != s[s.size()-i-1]) return false;
    return ispalindrome(i+1,s);
}
int main()
{
    string str;
    cout<<"enter string: ";
    cin>>str;
    if(ispalindrome(0,str))
    {
        cout<<"yes";
    } 
    else cout<<"no";
    return 0;
}
