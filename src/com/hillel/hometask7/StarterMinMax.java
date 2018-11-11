package com.hillel.hometask7;

public class StarterMinMax {
    public static void main(String[] args) {
        System.out.println("Минимальное и максимальное число из массива чисел типа int");
        int[] aIntNums = {-10, 20, 34, -11, 100, 20};
        int result1 = IntMinMax.intMinNumbers(aIntNums);
        System.out.println(result1);
        int result2 = IntMinMax.intMaxNumbers(aIntNums);
        System.out.println(result2);
        System.out.println();
        System.out.println("Минимальное и максимальное число из массива чисел типа double");


        double[] aDoubleNums = {2D,2.54,32.3,32,-100000000.43};
        System.out.println(DoubleMinMax.doubleMinNumbers(aDoubleNums));
        System.out.println(DoubleMinMax.doubleMaxNumbers(aDoubleNums));
    }
}
