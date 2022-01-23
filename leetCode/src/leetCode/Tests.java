package leetCode;

public class Tests {
	public void P13Test() {
		String roman = "MCMXCIV";
		P0013 test = new P0013();
		int result = test.romanToInt(roman);
		System.out.println(result);
	}
	
	
	public void P14Test() {
		String[] strs = {"flower","flow","flight"};
		P0014 test = new P0014();
		System.out.println(test.longestCommonPrefix(strs));
	}

	public void P15Test(){
		int[] nums = {-1,0,1,2,-1,-4};
		P0015 test = new P0015();
		System.out.println(test.threeSum(nums));

	}
}
