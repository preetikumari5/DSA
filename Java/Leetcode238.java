class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        a[0] = 1;
        for(int i=1;i<n;i++){
            a[i] = a[i-1]*nums[i-1];
        }
        int prevSuffix = 1;
        for(int i=n-2;i>=0;i--){
            prevSuffix *= nums[i+1];
            a[i]*=prevSuffix;
        }
        return a;
    }
}
