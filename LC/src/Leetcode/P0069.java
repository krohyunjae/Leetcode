package Leetcode;

public class P0069 {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int low = 1, high = x/2, ans = 0;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(x/mid == mid) return mid;
            else if (x/mid < mid) high = mid-1;
            else {low = mid+1; ans = mid;}
        }
        return ans;
    }

    public int mySqrt2(int x) {
        if (x <= 1) {
            return x;
        }

        long left = 0;
        long right = x;

        while (left < right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // When the loop exits, left will be the floor value of the square root.
        return (int) (left - 1);
    }
}
