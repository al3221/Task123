package com.hillel.hometask4;

public class Number {
    public static int sum(int num ){

        int hun = num - num%100;
        int hun1 = hun/100;

        int dec = num - hun;
        int dec1 =dec - dec%10;
        int dec2 = dec1/10;

        int un = num - hun - dec1;

        int result = hun1 + dec2 + un ;
        return result;
    }
}

