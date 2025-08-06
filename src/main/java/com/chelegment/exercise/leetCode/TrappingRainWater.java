package com.chelegment.exercise.leetCode;

import java.util.HashMap;

public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }


    public int trap(int[] height) {
        return calculateDrops(0, height);

    }

    public int calculateDrops(int start, int[] heights) {
        int startheight = heights[start];
        int end = 0;
        int endHeights = 0;
        int capacity = 0;
        if (start == heights.length - 1) {
            return 0;
        }
        for (int i = start + 1; i < heights.length; i++) {
            if (startheight == 0 && heights[i] != 0) {
                startheight = heights[i];
            } else if (startheight <= heights[i]) {
                end = i;
                endHeights = heights[i];
                break;
            } else if (i == heights.length - 1) {
                break;
            } else {
                capacity += startheight - heights[i];
            }
        }
        if (end == 0) {
            return calculateDrops(start + 1, heights);
        }


        capacity = capacity +
                calculateDrops(end, heights);
        return capacity;
    }

    public int reversCalculateDrops(int start, int[] heights, int end) {
        HashMap hashMap = new HashMap();
        int startheight = heights[start];
//        int end = 0;
        int endHeights = 0;
        int capacity = 0;
        if (start == heights.length - 1) {
            return 0;
        }
        for (int i = heights.length - 1; i > start; i--) {
            if (startheight == 0 && heights[i] != 0) {
                startheight = heights[i];
            } else if (startheight <= heights[i]) {
                end = i;
                endHeights = heights[i];
                break;
            } else if (i == heights.length - 1) {
                break;
            } else {
                capacity += startheight - heights[i];
            }
        }
        if (end == 0) {
            return calculateDrops(start + 1, heights);
        }


        capacity = capacity +
                calculateDrops(end, heights);
        return capacity;
    }


    static class Pair<T, K> {
        T first;
        K second;

        public Pair(T first, K second) {
            this.first = first;
            this.second = second;
        }
    }
}
