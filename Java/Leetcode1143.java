class Solution {
    int m,n;
    int dp[][] = new int[1001][1001];
    public int solve(String s1 , String s2 , int i,int j){
        if(i>=m || j>=n){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] =  1 + solve(s1,s2,i+1,j+1);
        }

        int take_i = solve(s1,s2,i,j+1);
        int take_j = solve(s1,s2,i+1,j);

        return dp[i][j] =  Math.max(take_i,take_j);
    }

    public int longestCommonSubsequence(String text1, String text2) {
        m = text1.length();
        n = text2.length();
        for(int i=0;i<1001;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(text1,text2,0,0);
    }
}
