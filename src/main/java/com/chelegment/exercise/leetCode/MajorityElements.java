package com.chelegment.exercise.leetCode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MajorityElements {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{}));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        Arrays.asList(nums).stream().sorted().collect(Collectors.toList());
        Collections.sort(new ArrayList(Arrays.asList(nums)));
        return nums[nums.length/2];
        //        int maxCount = 0;
//        int valueMax = 0;
//        Map<Integer, AtomicInteger> map = new HashMap();
//
//        for (int temp : nums) {
//            if (map.containsKey(temp)) {
//                int max = map.get(temp).incrementAndGet();
//                if (max > maxCount) {
//                    maxCount = max;
//                    valueMax = temp;
//                }
//            } else {
//
//                if (map.isEmpty()) {
//                    valueMax = temp;
//                    maxCount = 1;
//                }
//                map.put(temp, new AtomicInteger(1));
//            }
//        }
//        return valueMax;
    }

}
