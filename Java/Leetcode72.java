class Solution {
    int m,n;
    int dp[][] = new int[501][501];
    int solve(String s1,String s2,int i,int j){
        if(i==m){
            return n-j;
        }
        if(j==n){
            return m-i;
        }
        if(dp[i][j]!=-1) return dp[i][j];

        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = solve(s1,s2,i+1,j+1);
        }
        else{
            int insert = 1 + solve(s1,s2,i,j+1);
            int delete = 1 + solve(s1,s2,i+1,j);
            int replace = 1 + solve(s1,s2,i+1,j+1);
            int m1 = Math.min(insert,delete);

            return dp[i][j] = Math.min(m1,replace);
        }
        
    }
    public int minDistance(String word1, String word2) {
        m = word1.length();
        n = word2.length();
        for(int i=0;i<501;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(word1,word2,0,0);
    }
}