package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < len-3; i++){

            for(int j = i+1; j < len-2; j++){
                int low = j+1, high = len-1, sum = target-nums[i]-nums[j];
                while(low < high){
                    int localSum = nums[low] + nums[high];
                    if(localSum == sum){
                        result.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        while(low < high && nums[low] == nums[low+1]) low++;
                        while(low < high && nums[high] == nums[high]) high--;
                        low++;
                        high--;
                    } else if (localSum > sum){
                        high--;
                    } else {
                        low++;
                    }
                }
            }

        }
        return result;
    }
}
