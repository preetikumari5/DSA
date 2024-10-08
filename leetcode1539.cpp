// kth missing number in number line

class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        int n = arr.size();
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) 
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }
    return k + high + 1;
    }
};


// 2nd method
for(int i=0;i<arr.size();i++)
{
    if(arr[i]<=k) k++;
    else break;
}
return k;