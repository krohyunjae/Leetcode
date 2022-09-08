package Leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class P0013 {
    public int romanToInt(String s) {
//    	LinkedHashMap<String, Integer> roman = new LinkedHashMap<String, Integer>();
//    	roman.put("M", 1000);
////	    roman.put("CM", 900);
//	    roman.put("D", 500);
////	    roman.put("CD", 400);
//	    roman.put("C", 100);
////	    roman.put("XC", 90);
//	    roman.put("L", 50);
////	    roman.put("XL", 40);
//	    roman.put("X", 10);
////	    roman.put("IX", 9);
//	    roman.put("V", 5);
////	    roman.put("IV", 4);
//	    roman.put("I", 1);
//	    for(Map.Entry<String,Integer> entry : roman.entrySet()) {
//    	
//	    }

//	    int[] nums =     {1,5,10,50,100,500,1000};
//	    char[]romans = {'I','V','X','L','C','D','M'};
    	LinkedHashMap<Character, Integer> roman = new LinkedHashMap<Character, Integer>();
    	roman.put('I', 1);
	    roman.put('V', 5);
	    roman.put('X', 10);
	    roman.put('L', 50);
	    roman.put('C', 100);
	    roman.put('D', 500);
	    roman.put('M', 1000);
    	int result = 0;
    	char prev = 'I';
    	for(int i = s.length()-1; i >= 0; i--) {
    		if(roman.get(s.charAt(i)) < roman.get(prev)) {
    			result -= roman.get(s.charAt(i));
    		} else {
    			result += roman.get(s.charAt(i));
    			prev = s.charAt(i);
    		}
    	}
		return result;
    }
}
