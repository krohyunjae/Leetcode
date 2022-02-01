package leetCode;

import java.util.Iterator;
import java.util.Stack;

/*
 * Given a string s containing just the characters 
 * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
public class P0020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()) {
        	if(c == '(') {
        		stack.push(')');
        	} else if (c == '[') {
        		stack.push(']');
        	} else if (c == '{') {
        		stack.push('}');
        	} else if (stack.empty() || stack.pop() != c) {
        		return false;
        	}
        }
        return stack.isEmpty();
        
      
//        for(int i = 0; i < s.length(); i++) {
//        	char cur = s.charAt(i);
//        	if(cur == '(' || cur == '{' || cur == '[') {
//        		stack.push(cur);
//        	}else if(!stack.empty()) {
//        		char last = stack.pop();
//        		switch(last) {
//        		case '(': last = ')';
//        			break;
//        		case '{': last = '}';
//        			break;
//        		case '[': last = ']';
//        			break;
//        		default:
//        		}
//        		if(last != cur) return false;
//        	} else {
//        		return false;
//        	}
//        }
//        if(!stack.empty()) return false;
//    	return true;
    }
	
}
