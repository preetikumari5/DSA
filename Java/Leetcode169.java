class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int res = 0;
        for(int i:nums){
            if(c==0){
                res = i;
            }
            if(res==i) c++;
            else c--;
        }
        return res;
    }
}