package com.hillel.hometask2;

public class Calc {
    public static double method1(int a, double b, float c){
        double result = a + b*(c/2);
        return result;
    }
    public static double method2(double a, int b){
        double result = (a*a + b*b)%2;
        return result;
    }

    public static double method3(double a, int b, float c){
        double result = (a+b)/12*c%4;
        return result;
    }

    public static double method4(int a, double b, float c){
        double result = (a-b*c)/(a+b)%c;
        return result;
    }

}