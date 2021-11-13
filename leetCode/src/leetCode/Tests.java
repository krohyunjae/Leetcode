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
}
