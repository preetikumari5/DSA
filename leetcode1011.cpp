// minimum capacity to load a ship with

class Solution {
public:
    int findDays(vector<int> &arr , int cap)
    {
        int days = 1;
        int load = 0;
        for(int i=0;i<arr.size();i++)
        {
            if(load + arr[i]>cap)
            {
                days = days + 1;
                load = arr[i];
            }
            else
            {
                load = load + arr[i];
            }
        }
        return days;
    }
    int sum(vector<int> &arr)
    {
        int s = 0;
        for(int i=0;i<arr.size();i++)
        {
            s = s + arr[i];
        }
        return s;
    }
    int findMax(vector<int> &arr)
    {
        int maxi = INT_MIN;
        for(int i=0;i<arr.size();i++)
        {
            maxi = max(maxi,arr[i]);
        }
        return maxi;
    }
    int shipWithinDays(vector<int>& weights, int days) {
        int low = findMax(weights);
        int high = sum(weights);
        while(low<=high)
        {
            int mid = (low+high)/2;
            int d = findDays(weights,mid);
            if(d<=days)
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