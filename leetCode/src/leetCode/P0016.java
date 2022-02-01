package leetCode;

import java.util.Arrays;
import java.util.List;

/*
 * Given an integer array nums of length n and an integer target, 
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.
 */
public class P0016 {
    public int threeSumClosest(int[] nums, int target) {
    	
    	Arrays.sort(nums);
    	int result = nums[0] + nums[1] + nums[2];
    	
    	for(int i = 0; i < nums.length; i++) {
    		
    		int localClosest = twoSum(nums, target, i);
    		if(localClosest == target) return target;
    		if(Math.abs(target - localClosest) < Math.abs(target - result)) {
    			result = localClosest;
    		}
    		
    	}
    	

    	return result;
    }
    
    private int twoSum(int[] nums, int target, int i) {
    	int localClosest = nums[0] + nums[1] + nums[2];
    	int middle = i+1, end = nums.length-1;
    	while(middle<end) {
    		int cur = nums[i] + nums[middle] + nums[end];
    		if(cur == target) {
    			localClosest = cur;
    			break;
    		}else if(cur < target) {	
    			middle++;
    		}else {
    			end--;
    		}
    		if(Math.abs(target-localClosest) > Math.abs(target-cur)) {
    			localClosest = cur;
    		}
    	}
    	return localClosest;
    }
  
}
