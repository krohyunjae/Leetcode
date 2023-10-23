package Leetcode;

public class P0029 {
    /**
     * Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
     *
     * The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
     *
     * Return the quotient after dividing dividend by divisor.
     *
     * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−2^31, 2^31 − 1].
     * For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -2^31, then return -2^31.
     * @param dividend
     * @param divisor
     * @return quotient
     */
    public int divide(int dividend, int divisor) {
        return 0;
    }

    public int divideBrute(int dividend, int divisor){
        while(divisor < dividend){
            dividend -= divisor;
        }
    }


}
