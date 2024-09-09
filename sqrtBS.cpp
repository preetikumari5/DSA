// square root using binary search

class Solution {
  public:
    long long int floorSqrt(long long int n) {
       long long low = 1,high = n;
       long long ans = 0;
       while(low<=high)
       {
           long long mid = (low+high)/2;
           long long val = mid*mid;
           if(val<=n)
           {
               low = mid+1;
           }
           else{
               high = mid-1;
           }
       }
       return high;
    }
};