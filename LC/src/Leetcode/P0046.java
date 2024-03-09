package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0046 {
    /**
     * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
     *
     * Example 1:
     *
     * Input: nums = [1,2,3]
     * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     * Example 2:
     *
     * Input: nums = [0,1]
     * Output: [[0,1],[1,0]]
     * Example 3:
     *
     * Input: nums = [1]
     * Output: [[1]]
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(ans, new ArrayList<>(), nums);
        return ans;
    }

    public void permute(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!temp.contains(nums[i])) {
                temp.add(nums[i]);
                permute(list, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
