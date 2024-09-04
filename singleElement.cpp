// leetcode 504

class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int n = nums.size();
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            ans = ans ^ nums[i];
        }
        return ans;
    }
};


// 2nd approach
class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) 
    {
        int high=nums.size()-1;
        if(nums.size()==1)
        {
            return nums[0];
        } 
        for(int i=0;i<nums.size()-1;i=i+2)
        {
            if(nums[i]!=nums[i+1])
            {
                return nums[i];
            }
            if(nums[high]!=nums[high-1])
            {
                return nums[high];
            }
            high=high-2;
            
        } 
        return 1;   
    }
};