package Leetcode;

public class P0067 {
    /**
     * Given two binary strings a and b, return their sum as a binary string.
     *
     *
     *
     * Example 1:
     *
     * Input: a = "11", b = "1"
     * Output: "100"
     * Example 2:
     *
     * Input: a = "1010", b = "1011"
     * Output: "10101"
     */

    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0, i = a.length()-1, j = b.length()-1;
        while(i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) carry += a.charAt(i--) - '0';
            if (j >= 0) carry += b.charAt(j--) - '0';
            ans.append(carry % 2);
            carry /= 2;
        }
        return ans.reverse().toString();
    }

    public String addBinary2(String a, String b) {
        // when a or b is too large, doesn't work
        return Integer.toString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2), 2);
    }
}
