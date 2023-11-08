package Leetcode;

public class P0058 {
    /**
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     *
     * A word is a maximal
     * substring
     *  consisting of non-space characters only.
     *
     * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     */

    public int lengthOfLastWord(String s) {
        String[] res = s.split(" ");
        return res[res.length-1].length();
    }
    public int lengthOfLastWord2(String s) {
        int i = s.length()-1, count = 0;
        while(s.charAt(i) == ' ') i--;
        for(; i >= 0 && s.charAt(i) != ' '; i--){
            count++;
        }
        return count;
    }
}
