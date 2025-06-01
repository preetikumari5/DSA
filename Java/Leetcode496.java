class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2 = nums2.length;
        int[] ans = new int[n2];   // Stores next greater for each index in nums2
        Stack<Integer> stack = new Stack<>();

        // Step 1: Precompute next greater elements for nums2
        for (int i = n2 - 1; i >= 0; i--) {
            // Remove elements smaller than or equal to current
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                stack.pop();
            }
            // Set next greater if exists
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            // Push current element to stack
            stack.push(nums2[i]);
        }

        // Step 2: Map nums1 values to their next greater values in nums2
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums2[j] == nums1[i]) {
                    res[i] = ans[j];
                    break;
                }
            }
        }

        return res;
    }
}