package com.hillel.hometask2;

public class Starter {
    public static void main(String[] args){
        double result;
        result = Calc.method1(5,2.5,4.4F);
        System.out.println("a + b*(c/2 )= "+result);
        result = Calc.method2(2.1,2);
        System.out.println("(a^2+b^2)mod2 = "+result);
        result = Calc.method3(20.0,40,2F);
        System.out.println("(a+b)/12*c mod 4 = "+result);
        result = Calc.method4(20,2D,1F);
        System.out.println("(a-b*c)/(a+b) mod c = "+result);
    }
}