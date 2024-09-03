class Solution {
public:
    int bs(vector<int>&nums,int low,int high,int target)
    {
        if(low>high)
        {
            return -1;
        }
        int mid=low+(high-low)/2;
        if(nums[mid]==target)
        {
            return 1;
        }
        else if(nums[mid]>target)
        {
            return bs(nums,low,mid-1,target);
        }
        else
        {
            return bs(nums,mid+1,high,target);
        }
    }
    vector<int> searchRange(vector<int>& nums, int target) 
    {
        int f=0;
        vector<int> vec;
        f=bs(nums,0,nums.size()-1,target);
        if(f==-1)
        {

            return {-1,-1};
        }
        
        int lb=lower_bound(nums.begin(),nums.end(),target)-nums.begin();
        int ub=upper_bound(nums.begin(),nums.end(),target)-nums.begin();

        

        vec.push_back(lb);
        vec.push_back(ub-1);

        return vec;
    }
};