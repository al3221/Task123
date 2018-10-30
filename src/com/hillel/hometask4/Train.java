package com.hillel.hometask4;

public class Train {
    public static boolean probability(int v1, int v2){
        int time1 = 4/v1;
        int time2 = 6/v2;
        if (time1>time2){
            return false;
        }
        else return true;
    }
}
