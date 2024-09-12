// division sum

class Solution {
public:
    int divisionSum(vector<int> &arr,int div)
    {
        int m = arr.size(); //size of array
        //Find the summation of division values:
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += ceil((double)(arr[i]) / (double)(div));
        }
        return sum;
    }
    int smallestDivisor(vector<int>& nums, int threshold) 
    {
        int n = nums.size();
        if (n > threshold) return -1;
        int low = 1, high = *max_element(nums.begin(), nums.end());
    
        while (low <= high) 
        {
            int mid = (low + high) / 2;
            if (divisionSum(nums, mid) <= threshold) 
            {
                high = mid - 1;
            }
            else 
            {
                low = mid + 1;
            }
        }
    return low;
    }
};