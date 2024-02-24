package Leetcode;

import java.util.*;

public class P0040 {
    /**
     * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations
     * in candidates where the candidate numbers sum to target.
     *
     * Each number in candidates may only be used once in the combination.
     *
     * Note: The solution set must not contain duplicate combinations.
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int target, int start) {
        if(target == 0) {
            list.add(new ArrayList<>(temp));
        }
        for (int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) continue;
            if(nums[i] > target) break;
            temp.add(nums[i]);
            backtrack(list, temp, nums, target - nums[i], start + 1);
            temp.remove(temp.size() - 1);
        }

    }
}
