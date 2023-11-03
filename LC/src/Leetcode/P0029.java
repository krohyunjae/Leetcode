package Leetcode;

public class P0029 {
    /**
     *
     *
     * Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
     *
     * The integer division should truncate toward zero, which means losing its fractional part.
     * For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
     *
     * Return the quotient after dividing dividend by divisor.
     *
     * Note: Assume we are dealing with an environment that could only store integers
     * within the 32-bit signed integer range: [−2^31, 2^31 − 1]. For this problem,
     * if the quotient is strictly greater than 2^31 - 1, then return 2^31 - 1,
     * and if the quotient is strictly less than -2^31, then return -2^31.
     *
     *
     *
     * Example 1:
     *
     * Input: dividend = 10, divisor = 3
     * Output: 3
     * Explanation: 10/3 = 3.33333.. which is truncated to 3.
     * Example 2:
     *
     * Input: dividend = 7, divisor = -3
     * Output: -2
     * Explanation: 7/-3 = -2.33333.. which is truncated to -2.
     */

    public int divide(int dividend, int divisor) {
        // brute force - add divisor to itself until it's greater than dividend (mock multiplication)
        // better approach - bitwise? since removing the last bit from dividend & divisor would take significantly less time
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        boolean isNegative = dividend < 0 ^ divisor < 0;

        if(dividend < 0) dividend = ~dividend + 1;
        if(divisor < 0) divisor = ~divisor + 1;

        int subQuotient = 0;
        int quotient = 0;
        while(dividend - divisor >= 0) {
            for (subQuotient = 0; dividend - (divisor << subQuotient << 1) >= 0; subQuotient++);
            quotient += 1 << subQuotient;
            dividend -= divisor << subQuotient;
        }
        return isNegative? -quotient : quotient;
    }
}
