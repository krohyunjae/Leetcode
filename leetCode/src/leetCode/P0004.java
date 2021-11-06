package leetCode;

public class P0004 {
	public double bruteFindMedianSortedArrays(int[] nums1, int[] nums2) {
        // brute force
		int i = 0, j = 0, idx = 0;
		int merge[] = new int[nums1.length+nums2.length];
		while(i < nums1.length && j < nums2.length) {
			//merge arrays
			if(nums1[i] < nums2[j]) {
				merge[idx++] = nums1[i++];
			}else {
				merge[idx++] = nums2[j++];
			}
		}
		while(i<nums1.length) merge[idx++] = nums1[i++];
		while(j<nums2.length) merge[idx++] = nums2[j++];
		
		if(merge.length%2 == 0) {
			//if there's even number of numbers in the array
			
			return (double) (merge[(merge.length/2)-1]+merge[merge.length/2])/2;
		}
		return merge[merge.length/2]; 
    }
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		return 0;
	}
}
