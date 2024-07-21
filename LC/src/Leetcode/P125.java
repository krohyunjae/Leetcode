package Leetcode;

public class P125 {
    /**
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
     *
     * Given a string s, return true if it is a palindrome, or false otherwise.
     *
     *
     * Example 1:
     *
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     * @param s
     * @return Given a string s, return true if it is a palindrome, or false otherwise.
     */
    public boolean isPalindrome(String s) {
        if(s.isBlank()) return true;
        for(int i = 0, j = s.length()-1; i <= j;) {
            if(!isAlphaNumeric(s.charAt(i))) {
                i++;
                continue;
            }
            if(!isAlphaNumeric(s.charAt(j))) {
                j--;
                continue;
            }
            if(Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j))) return false;
            i++;j--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        if((c > 64 && c < 91) || (c > 96 && c < 123) || (c > 47 && c < 58)) {
            return true;
        } else {
            return false;
        }
    }
}
