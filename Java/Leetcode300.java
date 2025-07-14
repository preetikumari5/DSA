class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int maxLIS = 1;

        int dp[] = new int[n];
        Arrays.fill(dp,1);

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    maxLIS = Math.max(maxLIS,dp[i]);
                }
            }
        }
        return maxLIS;
    }
}