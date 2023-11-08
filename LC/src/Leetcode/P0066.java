package Leetcode;

public class P0066 {
    /**
     * You are given a large integer represented as an integer array digits,
     * where each digits[i] is the ith digit of the integer. The digits are ordered from most significant
     * to least significant in left-to-right order. The large integer does not contain any leading 0's.
     *
     * Increment the large integer by one and return the resulting array of digits.
     *
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Incrementing by one gives 123 + 1 = 124.
     * Thus, the result should be [1,2,4].
     */
    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length-1]++;
        if(digits[digits.length-1] > 9) {
            carry = 1;
            digits[digits.length-1] = 0;
            for(int i = digits.length - 2; i >= 0; i--) {
                if(digits[i] + carry > 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    break;
                }
            }
        }
        if(digits[0] == 0) {
            int newArr[] = new int[digits.length+1];
            newArr[0] = 1;
            return newArr;
        }
        return digits;
    }
}
