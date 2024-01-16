package Leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class P0030 {
    /**
     * You are given a string s and an array of strings words. All the strings of words are of the same length.
     *
     * A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.
     *
     * For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab"
     * are all concatenated strings. "acdbef" is not a concatenated substring because it is not the concatenation of
     * any permutation of words.
     * Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.
     */

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if(s == null || s.isEmpty() || words == null || words.length == 0) return ans;

        Map<String, Integer> dict = new HashMap<>();
        for(String word : words) {
            dict.put(word, dict.getOrDefault(word, 0) + 1);
        }
        int wordLen = words[0].length();
        int sLen = s.length();

        int l = 0, r = wordLen * words.length - 1;
        while(r < sLen) {
            if(check(s, l++, r++, wordLen, new HashMap<>(dict))) ans.add(l - 1);
        }
        return ans;
    }

    private boolean check(String s, int start, int end, int len, Map<String, Integer> dict) {
        for (int i = start; i <= end; i+= len) {
            String sub = s.substring(i, i + len);
            if(dict.getOrDefault(sub, 0) == 0) return false;
            dict.put(sub, dict.get(sub) - 1);
        }
        return true;
    }

}
