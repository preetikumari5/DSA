class Solution {
    
    public int longestStrChain(String[] words) {
        int n = words.length;
        Arrays.sort(words,(s1,s2) -> Integer.compare(s1.length(),s2.length()));
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int maxLen = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(isPred(words[j],words[i])){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    maxLen = Math.max(maxLen,dp[i]);
                }
            }
        }
        return maxLen;
    }
    public boolean isPred(String prev,String curr){
        int M = prev.length();
        int N = curr.length();

        if(M>=N || N-M != 1){
            return false;
        }

        int i = 0,j=0;
        while(i<M && j<N){
            if(prev.charAt(i)==curr.charAt(j)){
                i++;
            }
            j++;
        }
        return i==M;
    }
}