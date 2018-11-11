package com.hillel.hometask7;

public class DoubleMinMax {
    public static double doubleMinNumbers(double[] aDoubleNumbers){
        double min = aDoubleNumbers[0];
        for(int i = 1; i < aDoubleNumbers.length;i++){
            if(min>aDoubleNumbers[i]){
                min = aDoubleNumbers[i];
            }
        }
        return min;
    }
    public static double doubleMaxNumbers(double[] aDoubleNumbers){
        double max = aDoubleNumbers[0];
        for(int i = 1; i < aDoubleNumbers.length;i++){
            if(max<aDoubleNumbers[i]){
                max = aDoubleNumbers[i];
            }
        }
        return max;
    }
}
