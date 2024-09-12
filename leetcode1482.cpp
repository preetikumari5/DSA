// bloom day

class Solution {
public:
    // if the day is possible or not
    bool possible(vector<int> &arr,int day,int m,int k)
    {
        int n = arr.size();
        int cnt = 0;
        int bq = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=day)
            {
                cnt++;
            }
            else
            {
                bq = bq + (cnt/k);
                cnt = 0;
            }
        }
        bq = bq + (cnt/k);
        if(bq>=m)
        {
            return true;
        }
        return false;
    }

    int minDays(vector<int>& bloomDay, int m, int k) {
        long long flowers = m * 1LL * k * 1LL;
        int n = bloomDay.size();
        if(flowers>n) return -1;
        int mini = INT_MAX , maxi = INT_MIN;
        for(int i=0;i<n;i++)
        {
            mini = min(mini,bloomDay[i]);
            maxi = max(maxi,bloomDay[i]);
        }

        int low = mini , high = maxi;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k))
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
};