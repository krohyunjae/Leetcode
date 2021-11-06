package leetCode;

import java.util.LinkedHashMap;
import java.util.Map;
public class P0012 {
//	enum Roman{
//		I(1), X(10), ;
//		int num;
//		Roman(int j) {
//			this.num = j;
//		} 
//	};

    
	
	@SuppressWarnings("serial")
	LinkedHashMap<String, Integer> roman = new LinkedHashMap<String, Integer>(){{
        put("I", 1);
        put("IV", 4);
        put("V", 5);
        put("IX", 9);
        put("X", 10);
        put("XL", 40);
        put("L", 50);
        put("XC", 90);
        put("C", 100);
        put("CD", 400);
        put("D", 500);
        put("CM", 900);
        put("M", 1000);}};
	public String intToRoman(int num) {
		String result = "";
    	for(Map.Entry<String, Integer> entry : roman.entrySet()) {
    		
    	}
    	
    	
    	
    	
    	

    	return null;
//    	while(num != 0) {
//    		int lastDig = num%10;
//    		
//    		if(lastDig > 5) {
//    			if(lastDig == 9) {
//    				
//    			} else {
//    				
//    			}
//    		} else {
//    			if(lastDig == 4) {
//    				
//    			} else {
//    				
//    			}
//    		}
//    		
//    		
//    		num %= 10;
//    	}
    }
}
