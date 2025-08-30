class Solution {
    public int findPermutationDifference(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int n = s1.length;
        int si=0,ti=0;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s1[i]==t1[j]){
                    si=i;
                    ti=j;
                }
                
            }
            sum = sum + Math.abs(si-ti);
        }
        return sum;
    }
}