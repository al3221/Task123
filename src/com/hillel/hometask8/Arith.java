package com.hillel.hometask8;

public class Arith {
    public static int progression(int first, int step , int number){
        int result = 0;
        while (first < number){
            first = first + step;
            result = first;
            System.out.println(result);

        }
        return result;
    }
}
