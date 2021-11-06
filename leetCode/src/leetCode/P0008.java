package leetCode;

public class P0008 {
    public int myAtoi(String s) {
    	s = s.strip();
    	if (s.length() < 1) return 0;
    	boolean isNeg = false;
    	int start = 0;
    	if(s.charAt(0) == '-') {
    		isNeg = true;
    		start = 1;
    	} else if(s.charAt(0) == '+') {
    		start = 1;
    	}
    	long result = 0;
    	for(int i = start; i < s.length(); i++) {
    		if((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57) {
    			result  = result*10 + ((int)s.charAt(i) - 48);
    			if(-result <= Integer.MIN_VALUE && isNeg) {
    				return Integer.MIN_VALUE;
    			} else if(result >= Integer.MAX_VALUE && !isNeg) {
    				return Integer.MAX_VALUE;
    			}
    		} else {
    			break;
    		}
    	}
    	return isNeg? (int)-result : (int)result;
    }
}


//for(int i = s.length()-1; i >= start; i--) {
//	if((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57) {
//		result += (((int)s.charAt(i))-48)*((int)Math.pow(10, digit++));
//	}
//}