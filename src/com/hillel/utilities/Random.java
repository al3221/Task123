package com.hillel.utilities;

public class Random {
    public static int randomizer(int minX,int maxX){
        int result = (int)((Math.random()*(maxX - minX + 1))+minX);
        return result;
    }
}
