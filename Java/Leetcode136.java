class Solution {
    public int singleNumber(int[] nums) {
        int r = 0;
        while(int i:nums){
            r = r^i;
        }
        return r;
    }
}