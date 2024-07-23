#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    cin>>s;
    int p;
    int start = 0;
    int end = s.length()-1;
    while(start<end)
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