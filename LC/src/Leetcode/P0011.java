package Leetcode;

public class P0011 {
    public int maxArea(int[] height) {
        //brute force
    	int maxVol = 0;
    	for(int i = 0, j = height.length-1; j != i;) {
    		int lower_height = height[i] > height[j] ? height[j] : height[i];
    		int currVol = (lower_height * (j-i));
    		maxVol = maxVol > currVol ? maxVol : currVol;
    		if(height[i] > height[j]) {
    			j--;
    		} else {
    			i++;
    		}

    	}
    	return maxVol;
    }
}
