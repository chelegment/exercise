package com.chelegment.exercise.leetCode.algo;

public class BubbleSort {

    public void sortColors(int[] nums) {
        int r = 0, i = 0, length = nums.length;
        // Write your code here.
        while (true) {
            if (i + 1 == length) {
                if (r == 0) {
                    return;
                }
                i = 0;
                r = 0;
            }
            int t = nums[i];
            if (nums[i + 1] < t) {
                nums[i] = nums[i + 1];
                nums[i + 1] = t;
                r++;
            }
            i++;
        }
    }

    public static int[] bubbleSort(int[] array) {

        int r = 0, i = 0, length = array.length;
        // Write your code here.
        while (true) {
            if (i + 1 == length) {
                if (r == 0) {
                    return array;
                }
                i = 0;
                r = 0;
            }
            int t = array[i];
            if (array[i + 1] < t) {
                array[i] = array[i + 1];
                array[i + 1] = t;
                r++;
            }
            i++;

        }
    }

    public void sortColors2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
