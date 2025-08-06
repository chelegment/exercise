package com.chelegment.exercise.leetCode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[temp] = nums[i];
                temp++;
            }
        }
        return temp;
    }

    public int removeDuplicates2(int[] nums) {
        int offset = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i == nums.length - 1) {
                nums[j] = nums[i];
                j++;


            } else if (nums[i] == nums[i + 1]) {
                if (offset < 1) {
                    nums[j] = nums[i];
                    j++;
                }
                offset++;
            } else {

                nums[j] = nums[i];
                j++;
                offset = 0;
            }
        }
        return j;

    }
}
