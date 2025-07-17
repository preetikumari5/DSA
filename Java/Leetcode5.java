class Solution {
    int dp[][] = new int[1001][1001];
    int solve(String s,int l,int r){
        if(l>=r){
            return 1;
        }
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        if(s.charAt(l)==s.charAt(r)){
            return dp[l][r] = solve(s,l+1,r-1);
        }
        return dp[l][r] = 0;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        int maxLen = Integer.MIN_VALUE;
        int l = 0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s,i,j)==1){
                    if(j-i+1 > maxLen){
                        maxLen = j-i+1;
                        l = i;
                    }
                }
            }
        }
        return s.substring(l,l+maxLen);
    }
}