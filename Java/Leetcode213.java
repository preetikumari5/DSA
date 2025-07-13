class Solution {
    int t[] = new int[101];
    int solve(int[] nums,int i,int n){
        if(i>n) return 0;

        if(t[i]!=-1) return t[i];

        int steal = nums[i] + solve(nums,i+2,n);
        int skip = solve(nums,i+1,n);

        return t[i] = Math.max(steal,skip);
    }
    public int rob(int[] nums) {
        
        int n = nums.length;

        if(n==1) return nums[0];

        if(n==2) return Math.max(nums[0],nums[1]);
        Arrays.fill(t,-1);
        int take_0th_index = solve(nums,0,n-2);
        Arrays.fill(t,-1);
        int take_1st_index = solve(nums,1,n-1);

        return Math.max(take_0th_index,take_1st_index);
    }
}