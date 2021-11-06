package leetCode;

public class P0007 {

	//	Given a signed 32-bit integer x, return x with its digits reversed. 
	//	If reversing x causes the value to go outside the signed 32-bit 
	//	integer range [-2^31, 2^31 - 1], then return 0.
	public int reverse(int x) {
		int sign = 1;
		if(x < 0) {
			sign = -1;
			x = Math.abs(x);
		}
		int result = 0;
		int tail = 0;
		int temp = 0;
		while(x > 0) {
				tail = x%10;
				temp = result * 10 + tail;
				if((temp - tail)/10 != result) {
					return 0;
				}
				result = temp;
				x /= 10;
			}
		result *= sign;
		return result;
	}
}
