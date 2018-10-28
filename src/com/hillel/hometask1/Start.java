package com.hillel.hometask1;

public class Start {
    public static void main(String[] args){
        int result;
        result = Calculator.add(5,7);
        System.out.println(result);
        result = Calculator.sub(100,35);
        System.out.println(result);
        result = Calculator.mul(33,3);
        System.out.println(result);
        result = Calculator.div(200,50);
        System.out.println(result);

        System.out.println("////////////////////////////////");

        double result1;
        result1 = Calculator.add(5.3,7.69);
        System.out.println(result1);
        result1 = Calculator.sub(100.0,35.3);
        System.out.println(result1);
        result1 = Calculator.mul(33D,3D);
        System.out.println(result1);
        result1 = Calculator.div(200D,50.0);
        System.out.println(result1);
    }
}