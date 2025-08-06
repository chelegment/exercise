package com.chelegment.exercise.leetCode.algo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class CountInversions {

    public int countInversions(int[] array) {
        // Write your code here.
        int result = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    result++;

                }
            }
        }

        return result;
    }


}
