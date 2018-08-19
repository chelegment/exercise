package com.chelegment.exercise.gl.compress_decompression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompressDecompression {

    public static void main(String[] args) {
        System.out.println("He110 W0r1D");
        int in= 99999999;
        System.out.println(
                in*100
        );
        String input = "2[3[x]y]4[ab]c";
        CompressDecompression compressDecompression = new CompressDecompression();
        compressDecompression.parse(input);
    }

    private String parse(String input) {
        int startBlock = input.indexOf('[');
        String digit = input.substring(0, startBlock);
        String innerBlock = findEndBlock(input, startBlock);

        return null;
    }

    private String findEndBlock(String input, int startBlock) {
        final int index = 0;
        final boolean[] b = {true};
        final String[] result = {""};
//        input.substring(startBlock).chars().forEach(i->{
//
//            if(i==']'&& b[0]){
//                return result;
//            }else if (i=='['){
//            b[0] = false;
//            }
//            result[0] +=i;
//        });

        return null;
    }


}
