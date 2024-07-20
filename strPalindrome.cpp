#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    cin>>s;
    int p;
    for(int i=0;i<s.length();i++)
    {
        while (start<end && !isalnum(s[start]))
        {
            start++;
        }
       while (start<end && !isalnum(s[end]))
        {
            end--;
        }
        if(start<end && tolower(s[start]) != tolower(s[end])) p=0;
        
    }
    p=1;
    if(p==1)
    {
        cout<<"true";
    }
    else cout<<"false";
    return 0;
}