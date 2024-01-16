package Leetcode;

public class P0033 {
    /**
     * There is an integer array nums sorted in ascending order (with distinct values).
     *
     * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
     * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
     * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
     *
     * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     *
     * Example 1:
     *
     * Input: nums = [4,5,6,7,0,1,2], target = 0
     * Output: 4
     * Example 2:
     *
     * Input: nums = [4,5,6,7,0,1,2], target = 3
     * Output: -1
     * Example 3:
     *
     * Input: nums = [1], target = 0
     * Output: -1
     */

    public int search(int[] nums, int target) {
        int len = nums.length;
        // if rotation happened, nums[0] must be bigger than nums[n-1]
        // if target > nums[0], then start searching from nums[0]
        // otherwise start from nums[n-1]
        if(len == 0) return -1;
        if(nums[0] > nums[len -1]) {
            // rotation happened
            if(nums[0] <= target) {
                for (int i = 0; i < len; i++) {
                    if(nums[i] == target) return i;
                    if(nums[i] > nums[i+1]) {
                        // reached the pivot
                        return -1;
                    }
                }
            } else {
                for (int i = len-1; i >= 0 ; i--) {
                    if(nums[i] == target) return i;
                    if(nums[i-1] > nums[len-1]) return -1;
                }
            }
        } else {
            int l = 0, r = len-1;
            while(l <= r) {
                int mid = l + (r-l)/2;
                if(nums[mid] == target) return mid;
                else if (nums[mid] > target) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            }
            return -1;
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        // find the pivot first then deal with the search later
    }
}
