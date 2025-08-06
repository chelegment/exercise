package com.chelegment.exercise.leetCode;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int temp = -101;
        int count = 0;
        for(int i = 0; i<nums.length; i++){

            if(nums[i]!=temp){
                nums[count]=nums[i];
                count++;
            }
            temp=nums[i];
        }
        return count;
    }
}
