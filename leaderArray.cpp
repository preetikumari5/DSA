// leader in an array

#include<bits/stdc++.h>
using namespace std;
// brute force approach

class Solution {
    // Function to find the leaders in the array.
  public:
    vector<int> leaders(int n, int arr[]) {
        // Code here
        vector<int> ans;
        for(int i=0;i<n;i++)
        {
            bool leader = true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    leader = false;
                    break;
                }
            }
            if (leader) ans.push_back(arr[i]);
        }
        return ans;
    }
};




// optimal solution
vector<int> printLeaders(int arr[], int n) {

  vector<int> ans;
  
 // Last element of an array is always a leader,
 // push into ans array.
 int max = arr[n - 1];
 ans.push_back(arr[n-1]);

  // Start checking from the end whether a number is greater
  // than max no. from right, hence leader.
  for (int i = n - 2; i >= 0; i--)
    if (arr[i] > max) {
      ans.push_back(arr[i]);
      max = arr[i];
    }

  
  return ans;
}



