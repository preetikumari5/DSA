#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s,s1;
    cin>>s;
    // string s1="";
    int p;
    for(int i=0;i<s.length();i++)
    {
        if(s[i]>='A' || s[i]<='Z')
        {
            s[i]= s[i] + ('a'-'A');
            s1[i] += s[i];
        }
        if(s[i]>='a' || s[i]<='z')
        {
            s1[i] += s[i];
        }
    }
    cout<<s;
    // if(p==1)
    // {
    //     cout<<"true";
    // }
    // else cout<<"false";
    return 0;
}