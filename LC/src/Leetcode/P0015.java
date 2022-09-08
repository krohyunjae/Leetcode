package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
public class P0015 {
    /*Given an integer array nums, return all the triplets 
    [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
     and nums[i] + nums[j] + nums[k] == 0.*/
     public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length-1; i++){
            if(nums[i] <= 0){
                if(i == 0 || nums[i] != nums[i-1]){
                    int low = i+1, high = nums.length-1;
                    while(low < high){
                        if((nums[low]+nums[high]) == -nums[i]){
                            triplets.add(Arrays.asList(nums[i], nums[low], nums[high]));
                            while(low < high && nums[low] == nums[low+1]) low++;
                            while(low < high && nums[high] == nums[high-1]) high--;
                            low++; high--;
                        }else if ((nums[low]+nums[high]) < -nums[i]){
                            low++;
                        } else {
                            high--;
                        }
                    }
                }
            }
            
        }

        return triplets;

        // for(int i = 0; i < nums.length; i++) System.out.println(nums[i]);
        
        // for(int i = 0; i < nums.length-2; i++){
        //     int low = i+1;
        //     int high = nums.length-1;
        //     while(low < high){


        //         // if(sumIsZero(nums[i], nums[low], nums[high])) triplets.add(new List<Integer>());
        //     }
        // }


    	
    	// return null;
    }

    private boolean sumIsZero(int ... ints){
        int sum = 0;
        for(int i = 0; i < ints.length; i++){
            sum += ints[i];
        }
        return sum == 0;
    }


}
