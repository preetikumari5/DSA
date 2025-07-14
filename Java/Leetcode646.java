class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        int MaxL = 1;

        int dp[] = new int[n];
        Arrays.fill(dp,1);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(pairs[j][1]<pairs[i][0]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    MaxL = Math.max(dp[i],MaxL);
                }
            }
        }
        return MaxL;
    }
}

