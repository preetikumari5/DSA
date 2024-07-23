// intersection of arrays

#include<bits/stdc++.h>
using namespace std;

// brute force approach



// optimal approach
vector < int > FindInterSection(int arr1[], int arr2[], int n, int m) 
{
    int i=0,j=0;
    vector <int> InterSection;
    while(i<n && j<m)
    {
        if (arr1[i] == arr2[j]) // Case 1 and 2
        {
            if (InterSection.size() == 0 || InterSection.back() != arr1[i])
                InterSection.push_back(arr1[i]);
                i++;
        } else // case 3
        {
            if (InterSection.size() == 0 || InterSection.back() != arr2[j])
                InterSection.push_back(arr2[j]);
                j++;
        }
    }
}

int main() {
  int n = 10, m = 7;
  int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
  vector < int > Union = FindInterSection(arr1, arr2, n, m);
  cout << "InterSection of arr1 and arr2 is " << endl;
  for (auto & val: Union)
    cout << val << " ";
  return 0;
}