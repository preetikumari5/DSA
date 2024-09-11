//  koko eating banana

class Solution {
public:
    int findMax(vector<int> &arr)
    {
        int maxi = INT_MIN;
        int n = arr.size();
        for(int i = 0; i < n; i++)
        {
            maxi = max(maxi, arr[i]);
        }
        return maxi;
    }

    long long totalHours(vector<int> &a, int h) // Change return type to long long
    {
        int n = a.size();
        long long totalH = 0; // Change type to long long to avoid overflow
        for(int i = 0; i < n; i++)
        {
            // Integer ceiling of (a[i] / h)
            totalH += (a[i] + h - 1) / h;
        }
        return totalH;
    }

    int minEatingSpeed(vector<int>& piles, int h) {
        int low = 1, high = findMax(piles);
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            long long hours = totalHours(piles, mid); // Adjust to handle larger values
            if(hours <= h)
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
