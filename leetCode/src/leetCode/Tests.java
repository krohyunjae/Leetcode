package leetCode;

import java.util.Arrays;
import java.util.List;


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
		int[] nums2 = {0,0,0};
		P0015 test = new P0015();
		
		System.out.println(test.threeSum(nums));
		
	}
	
	public void P16Test() {
		int[] nums1 = {-1,2,1,-4};
		int target1 = 1; // expected result = 2;
		
		int[] nums2 = {0,0,0};
		int target2 = 1;
		
		P0016 test = new P0016();
		System.out.println(test.threeSumClosest(nums1, target1));
	}

	public void P17Test(){
		String digits = "23";
		P0017 test = new P0017();
		List<String> result = test.letterCombinations(digits);
		System.out.println(result);
	}
	
	public void P21Test() {
		P0021 test = new P0021();
		ListNode list1 = new ListNode();
		
		test.mergeTwoLists(list1, null);
	}

	public void P26Test(){
		P0026 test = new P0026();
		int[] nums = {1,1,2};
		System.out.println(test.removeDuplicates(nums));

	}

	public void P27Test(){
		P0027 test = new P0027();
		int[] nums = {3,2,2,3};
		int val = 3;
		System.out.println(test.removeElement(nums, val));
	}
}
