package leetCode;

public class P0026 {
	/*
	 * Given an integer array nums sorted in non-decreasing order, remove the
	 * duplicates in-place such that each unique element appears only once. The
	 * relative order of the elements should be kept the same.
	 * 
	 * Since it is impossible to change the length of the array in some languages,
	 * you must instead have the result be placed in the first part of the array
	 * nums. More formally, if there are k elements after removing the duplicates,
	 * then the first k elements of nums should hold the final result. It does not
	 * matter what you leave beyond the first k elements.
	 * 
	 * Return k after placing the final result in the first k slots of nums.
	 */
	
	public int removeDuplicates(int[] nums) {
		if(nums.length < 1) return 0;
		
		int k = 1;
		int next = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] == nums[i-1]) {
				continue;
			} else {
				nums[k++] = nums[i];
			}
			if(nums[i] == nums[nums.length-1] && i < nums.length) { 
				// TODO: do final operation and break
				nums[k++] = nums[i];
				break;
			}
		}
        return k;
    }
}
