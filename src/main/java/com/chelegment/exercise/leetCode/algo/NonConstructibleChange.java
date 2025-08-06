package com.chelegment.exercise.leetCode.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonConstructibleChange {
    public static void main(String[] args) {
        System.out.println(nonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 22}));
    }


//    public static int nonConstructibleChange(int[] coins) {
//        Arrays.sort(coins);
//        List<Integer> coinsl = new ArrayList<>(coins.length);
//        Arrays.stream(coins).forEach(coinsl::add);
//        // Getting the list view of Array
//        int result = 1;
//        while (true) {
//            System.out.println(coinsl);
//            if (!coinsl.contains(result)) {
//                int j = result - 1, i = 0, preSum = 0;
//                while (j != i) {
//                    if (coinsl.lastIndexOf(j) != -1) {
//                        int sum = coins[i] + coins[j];
//                        if (sum == result) {
//                            break;
//                        } else if (sum > result) {
//                            if (i == 0) {
//                                j--;
//                            } else {
//                                sum
//                            }
//                        } else {
//
//                            i++;
//                        }
//
//                    } else {
//                        j--;
//                    }
//                }
//                if (i == j) {
//                    return result;
//                }
//            }
//            result++;
//        }
//    }
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int c=0;
        for(int i = 0;i < coins.length;i++){
            int current = coins[i];
            System.out.println(current);
            if(current>(c+1)){
                return c+1;
            }else{
                c=c+current;
            }
        }

        return c+1;
    }

    public static int nonConstructibleChangeDP(int[] coins) {
        int sum = Arrays.stream(coins).sum();
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int coin : coins) {
            for (int i = sum; i >= coin; i--) {
                dp[i] |= dp[i - coin];
            }
        }
        for (int i = 1; i <= sum; i++) {
            if (!dp[i]) {
                return i;
            }
        }
        return sum + 1;

    }

}
