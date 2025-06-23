class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int maxCount = 0;
        int i = 0; 
        for(int j=0;j<s.length();j++){
            maxCount = Math.max(maxCount, ++freq[s.charAt(j)-'A']);
            if((j-i+1)-maxCount > k){
                freq[s.charAt(i++)-'A']--;
            }
        }
        return s.length() - i;
    }
}