package Leetcode;

import java.util.HashSet;
import java.util.Set;
public class P0003 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, length = 0;
        Set<Character> set = new HashSet<Character>();
        while(right < s.length()) {
        	if(set.contains(s.charAt(right))) {
        		set.remove(s.charAt(left++));
        	}else {
        		set.add(s.charAt(right++));
        		length = Math.max(set.size(), length);
        	}
        }
        return length;
    }
}
