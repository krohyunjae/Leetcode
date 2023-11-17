package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0118 {
    /**
     * Given an integer numRows, return the first numRows of Pascal's triangle.
     *
     * Example 1:
     *
     * Input: numRows = 5
     * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     * Example 2:
     *
     * Input: numRows = 1
     * Output: [[1]]
     */
    private Map<Integer, List<Integer>> memo = new HashMap<>();
    public List<List<Integer>> generate(int numRows) {
        memo.put(1, List.of(1));
        helper(numRows);
        return memo.values().stream().toList();
    }

    private List<Integer> helper(int numRows) {
        if(memo.containsKey(numRows)) return memo.get(numRows);
        else {
            List<Integer> prev = helper(numRows-1);
            List<Integer> ans = new ArrayList<>(List.of(1));
            for(int i = 1; i < prev.size(); i++) {
                if(prev.get(i) != null)
                    ans.add(i, (prev.get(i-1) + prev.get(i)));
            }
            ans.add(1);
            memo.put(numRows, ans);
            return ans;
        }
    }
}
