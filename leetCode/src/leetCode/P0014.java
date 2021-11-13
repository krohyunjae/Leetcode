package leetCode;

public class P0014 {
	
	//If we decide to iterate every string for a single character of a prefix each time,
	// the time complexity will be much worse
	// Therefore we need to match the first string to the rest
	public String longestCommonPrefix(String[] strs) {
//		if(strs.length < 1) {
//			return  null;
//		}
		String curr;
		String prefix = strs[0];
		for(int i = 1; i < strs.length; i++) {
			curr = strs[i];
//			if(curr.length() > prefix.length() && !strs[i].substring(0, prefix.length()-1).equals(prefix)) {
//				
//			}
			prefix = findCommonPrefix(curr, prefix);
		}
		
		
		return prefix;
	}
	
	public String findCommonPrefix(String a, String b) {
		int length = a.length() < b.length() ? a.length():b.length();
		StringBuilder prefix = new StringBuilder();
		for (int i = 0; i < length; i++) {
			if(a.charAt(i) == b.charAt(i)) {
				prefix.append(a.charAt(i));
			}else {
				break;
			}
		}
		return prefix.toString();
	}
}
