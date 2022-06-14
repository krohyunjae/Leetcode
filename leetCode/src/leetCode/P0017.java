package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class P0017 {
    /* Given a string containing digits from 2-9 inclusive, 
     * return all possible letter combinations that the 
     * number could represent. Return the answer in any order. */
    public List<String> letterCombinations(String digits){
        // ASCII lower case a = 61
        List<String> ans = new ArrayList<String>();

        if(digits.length() == 0 || digits.isEmpty()) return ans;

        Map<Integer, char[]> buttons = new HashMap<>();
        buttons.put(2, new char[]{'a','b','c'});
        buttons.put(3, new char[]{'d','e','f'});
        buttons.put(4, new char[]{'g','h','i'});
        buttons.put(5, new char[]{'j','k','l'});
        buttons.put(6, new char[]{'m','n','o'});
        buttons.put(7, new char[]{'p','q','r','s'});
        buttons.put(8, new char[]{'t','u','v'});
        buttons.put(9, new char[]{'w','x','y','z'});

        StringBuilder s = new StringBuilder();
        helper(s,ans,digits,buttons);
        return ans;
        
    }

    private void helper (StringBuilder sb, List<String> ans, String digits, Map<Integer, char[]> buttons){
        if(sb.length() == digits.length()){
            ans.add(new String(sb));
            return;
        }

        int digit = Character.getNumericValue(digits.charAt(sb.length()));
        char[] letters = buttons.get(digit);
        for(char c : letters){
            sb.append(c);
            helper(sb, ans, digits, buttons);
            sb.deleteCharAt(sb.length()-1);
        }


    }
}
