package com.chelegment.exercise.leetCode;

public class IntToRoman {

    class Solution {
        public String intToRoman(int num) {
            StringBuilder result = new StringBuilder();
            int temp = num, i = 1, v = 5, x = 10, l = 50, c = 100, d = 500, m = 1000;
            while (temp >= i) {
                System.out.println(temp);
                if (temp >= m) {
                    temp -= m;
                    result.append('M');
                } else if (temp + c >= m) {
                    temp -= m - c;
                    result.append("CM");
                } else if (temp + l >= m) {
                    temp -= m - l;
                    result.append("LM");
                } else if (temp + x >= m) {
                    temp -= m - x;
                    result.append("XM");
                } else if (temp + v >= m) {
                    temp -= m - v;
                    result.append("VM");
                } else if (temp + i >= m) {
                    temp -= m - i;
                    result.append("IM");
                } else if (temp >= d) {
                    temp -= d;
                    result.append('D');
                } else if (temp + c >= d) {
                    temp -= d - c;
                    result.append("CD");
                } else if (temp + l >= d) {
                    temp -= d - l;
                    result.append("LD");
                } else if (temp + x >= d) {
                    temp -= d - x;
                    result.append("XD");
                } else if (temp + v >= d) {
                    temp -= d - v;
                    result.append("VD");
                } else if (temp + i >= d) {
                    temp -= d - i;
                    result.append("ID");
                } else if (temp >= c) {
                    temp -= c;
                    result.append('C');
                } else if (temp + x >= c) {
                    temp -= c - x;
                    result.append("XC");
                } else if (temp + v >= c) {
                    temp -= c - v;
                    result.append("VC");
                } else if (temp + i >= c) {
                    temp -= c - i;
                    result.append("IC");
                } else if (temp >= l) {
                    temp -= l;
                    result.append('L');
                } else if (temp + x >= l) {
                    temp -= l - x;
                    result.append("XL");
                } else if (temp + v >= l) {
                    temp -= l - v;
                    result.append("VL");
                } else if (temp + i >= l) {
                    temp -= l - i;
                    result.append("IL");
                } else if (temp >= x) {
                    temp -= x;
                    result.append('X');
                } else if (temp + i >= x) {
                    temp -= x - i;
                    result.append("IX");
                } else if (temp >= v) {
                    temp -= v;
                    result.append('V');
                } else if (temp + i >= v) {
                    temp -= v - i;
                    result.append("IV");
                } else if (temp >= i) {
                    temp -= i;
                    result.append('I');
                }
            }
            return result.toString();


        }
    }

    public String intToRomanBest(int num) {
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ths[]={"","M","MM","MMM"};

        return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
    }
}
