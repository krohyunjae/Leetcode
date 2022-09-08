package Leetcode;

// Sliding Window Problem
public class P0239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k];
        for(int i = 0; i <= nums.length - k; i++){
            int localMax = 0;
            for(int j = i; j < k+i; j++){
                localMax = localMax > nums[j] ? localMax : nums[j];
            }
            ans[i] = localMax;
        }

        return ans;
    }
    
}
