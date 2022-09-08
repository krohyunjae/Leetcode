package Leetcode;

public class P0009 {
	//Palindrome Number
	public boolean isPalindrome(int x) {
		if(x < 0) return false;
		String str = Integer.toString(x);
		if(str.length() % 2 == 0) {
			//length is even number
			for(int i = str.length()/2 -1, j = str.length()/2; i >= 0 && j < str.length(); i--, j++) {
				if(str.charAt(i) != str.charAt(j)) {
					return false;
				}
			}
		} else {
			//length is odd number
			for(int i = str.length()/2 - 1 , j = str.length()/2 + 1; i >= 0 && j < str.length(); i--, j++) {
				if(str.charAt(i) != str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
