package leetCode;

import java.util.LinkedHashMap;
import java.util.Map;
public class P0012 {
	
	public String intToRoman(int num) {
		LinkedHashMap<String, Integer> roman = new LinkedHashMap<String, Integer>();
	    roman.put("M", 1000);
	    roman.put("CM", 900);
	    roman.put("D", 500);
	    roman.put("CD", 400);
	    roman.put("C", 100);
	    roman.put("XC", 90);
	    roman.put("L", 50);
	    roman.put("XL", 40);
	    roman.put("X", 10);
	    roman.put("IX", 9);
	    roman.put("V", 5);
	    roman.put("IV", 4);
	    roman.put("I", 1);
		
		String result = "";
    	for(Map.Entry<String, Integer> entry : roman.entrySet()) {
    		int matches = num/entry.getValue();
    		result += repeat(entry.getKey(), matches);
    		num = num % entry.getValue();
    	}
    	return result;
    }
	private static String repeat(String s, int n) {
		if(s.equals(null)) {
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(s);
		}
		return sb.toString();
	}
}
