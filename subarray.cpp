// longest subarray with maximum sum


#include<bits./stdc++.h>
using namespace std;

// brute force approach
int longestSubarray(vector<int> a,long long k)
{
    int len = 0;
    for(int i=0;i<a.size();i++)
    {
        for(int j=i;j<a.size();j++)
        {
            int s = 0;
            for(int l = i;l<=j;l++)
            {
                s = s+a[i];
            }
            if(s==k)
            {
                len = max(len,j-i+1);
            }
        }
    }
    return len;
}

// better solution for negative,positive or zero
int longestSubarray(vector<int> a,long long k)
{
    map<long long,int> preSumMap;
    long long sum = 0;
    int maxlen = 0;
    for(int i=0;i<a.size();i++)
    {
        sum += a[i];
        if(sum==k)
        {
            maxlen=max(maxlen,i+1);
        }
        long long rem = sum-k;
        if(preSumMap.find(rem) != preSumMap.end())
        {
            int len = i-preSumMap[rem];
            maxlen = max(maxlen,len);
        }
        if(preSumMap.find(sum)==preSumMap.end())
        {
            preSumMap[sum] = i;
        }
    }
    return maxlen;
}


// optimal solution for positive and zeros 
int longestSubarray(vector<int> a,long long k)
{
    int left=0,right=0;
    long long sum = a[0];
    int maxlen = 0;
    int n=a.size();
    while(right<n)
    {
        while(sum>k)
        {
            sum-=a[left];
        }
        if(sum==k)
        {
            maxlen = max(maxlen,right-left+1);
        }
        right++;
        if(right<n)  sum+=a[right];
    }
}



