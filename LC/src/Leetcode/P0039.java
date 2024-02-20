package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0039 {
    /**
     * Given an array of distinct integers candidates and a target integer target, return a list of all unique
     * combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
     *
     * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
     * frequency
     *  of at least one of the chosen numbers is different.
     *
     * The test cases are generated such that the number of unique combinations that sum up to target is less than
     * 150 combinations for the given input.
     *
     * Example 1:
     *
     * Input: candidates = [2,3,6,7], target = 7
     * Output: [[2,2,3],[7]]
     * Explanation:
     * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
     * 7 is a candidate, and 7 = 7.
     * These are the only two combinations.
     * Example 2:
     *
     * Input: candidates = [2,3,5], target = 8
     * Output: [[2,2,2,2],[2,3,3],[3,5]]
     * Example 3:
     *
     * Input: candidates = [2], target = 1
     * Output: []
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // use set to store the results
        // use modular to see if target is multiple of a member
        List<List<Integer>> ans = new ArrayList<>();
        getCombinations(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    private void getCombinations(List<List<Integer>> list, List<Integer> temp, int[] nums, int target, int start) {
        if(target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if(nums[i] <= target) {
                temp.add(nums[i]);
                getCombinations(list, temp, nums, target-nums[i], i);
                list.remove(list.size()-1);
            }
        }
    }












    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int start) {
        list.add(new ArrayList<>(temp));
        for(int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(list, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }

}
