package com.chelegment.exercise.leetCode;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int temp1 = 0;
        int index = 0;
        int i = 0;
        int temp = nums[index];
        int indexNew = 0;
        if (length == 1) {
            return;
        }
        if (k > length) {
            k = k % length;
        }
        while (i < length) {
            if (index + k < length) {
                indexNew = index + k;
            } else {
                indexNew = index + k - length;

            }
            temp1 = nums[indexNew];
            nums[indexNew] = temp;
            i++;
            if (indexNew + k - length == index) {
                nums[index] = temp1;
                index++;
                if (index >= length) {
                    break;
                }
                temp = nums[index];
                i++;
            } else {
                index = indexNew;
                temp = temp1;

            }

        }
    }
}
