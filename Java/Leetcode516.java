class Solution {
    int dp[][] = new int[1001][1001];
    int solve(String s,int l,int r){
        if(l>r){
            return 0;
        }
        if(l==r){
            return 1;
        }
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        if(s.charAt(l)==s.charAt(r)){
            return dp[l][r] = 2 + solve(s,l+1,r-1);
        }
        else {
            return dp[l][r] = Math.max(solve(s,l+1,r),solve(s,l,r-1));
        }
    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(s,0,n-1);
    }
}
