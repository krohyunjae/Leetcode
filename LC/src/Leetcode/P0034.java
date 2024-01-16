package Leetcode;

public class P0034 {
    /**
     *
     *
     * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
     *
     * If target is not found in the array, return [-1, -1].
     *
     * You must write an algorithm with O(log n) runtime complexity.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     * Example 2:
     *
     * Input: nums = [5,7,7,8,8,10], target = 6
     * Output: [-1,-1]
     * Example 3:
     *
     * Input: nums = [], target = 0
     * Output: [-1,-1]
     */

    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(nums[mid] == target) {
                int indexL = mid-1 < 0 ? 0 : mid-1, indexR = mid+1;
                while(indexL >= 0) {
                    if(nums[indexL] == target) indexL--;
                    else break;
                }
                while(indexR < nums.length) {
                    if(nums[indexR] == target) indexR++;
                    else break;
                }
                return new int[] {indexL + 1, indexR -1};
            } else if(nums[mid] < target) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }

        return new int[]{-1,-1};
    }

}
