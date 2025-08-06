package com.chelegment.exercise.leetCode;

import java.util.Arrays;

public class MergeSortedArrays {


    public static void main(String[] args) {

        int[] nums1 = {2, 0};
        int[] nums2 = {1};
        merge(nums1, 3, nums2, 3);
        Arrays.stream(nums1).forEach(i -> System.out.print(i));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = -1;
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i]=nums2[j];
            j++;
            // if ((temp != -1 && temp <= nums1[i] && temp != 0 ) || (nums1[i] == 0 && temp != 0 && temp != -1)) {
            //     int t = nums1[i];
            //     nums1[i] = temp;
            //     temp = t;
            //     i--;
            // } else if ((j < n) && (nums1[i] >= nums2[j] || nums1[i] == 0)) {
            //     temp = nums1[i];
            //     nums1[i] = nums2[j];
            //     j++;
            // }

        }
        Arrays.sort(nums1);
    }

}
