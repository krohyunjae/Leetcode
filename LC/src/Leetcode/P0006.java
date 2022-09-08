package Leetcode;

public class P0006 {
	public String convert(String s, int numRows) {
		int len = s.length();
		if (numRows < 2 || len <= numRows) {
			return s;
		}
		StringBuilder[] sb = new StringBuilder[numRows];
		for(int i = 0; i < numRows ; i++) {
			sb[i] = new StringBuilder();
		}
		int i = 0;
		while(i<len) {
			//vertical
			for(int index = 0; index < numRows && i < len; index++) {
				sb[index].append(s.charAt(i++));
			}
			//oblique
			for(int index = numRows-2; index > 0 && i<len; index--) {
				sb[index].append(s.charAt(i++));
			}
				
		}
		for(int index = 1; index < numRows; index++) {
			sb[0].append(sb[index]);
		}
		return sb[0].toString();
	}
}
