package com.hillel.hometask4;

public class Train {
    public static boolean probability(float v1, float v2){
        float time1 = 4/v1;
        float time2 = 6/v2;
        if (time1<time2){
            return false;
        }
        else  return true;
    }
}
