package com.hillel.hometask4;

public class Converter {
    public static long dollarinhryvnia(long dollar){
        long rate = 2818;
        long result = dollar*rate;
        return result;
    }
    public static long hryvniaindollar(long hryvnia){
        long rate = 2818;
        long result = hryvnia/rate;
        return result;
    }
}
