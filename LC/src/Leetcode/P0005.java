package Leetcode;

//Longest Palindrome
public class P0005 {
	public String longestPalindrome(String s) {
		int maxLength = 0, start = -1;
		for(int i = 0; i < s.length(); i++) {
			int length = Math.max(getLength(i, i, s), getLength(i, i+1, s));
			if(maxLength < length) {
				maxLength = length;
				start = i - (length-1)/2;
			}
		}
		return s.substring(start, start+maxLength);
	}
	private int getLength(int left, int right, String s) {
		if (right >= s.length()) return 0;
		int length = (left==right) ? -1 : 0;
		while(left >= 0 && right <= s.length()) {
			if(s.charAt(left) != s.charAt(right)) break;
			left--;
			right++;
			length+=2;
		}
		return length;
	}
}
