class Solution {
    public String orderlyQueue(String s, int k) {
        if(k==0) return s;
        else if(k>1){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }
        else if(k==1){
            String ans = s;
            for(int i=1;i<s.length();i++){
                String str = s.substring(i) + s.substring(0,i);
                if(ans.compareTo(str)>0){
                    ans = str;
                }
            }
            return ans;
        }
        return s;
    }
}