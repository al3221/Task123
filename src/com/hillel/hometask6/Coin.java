package com.hillel.hometask6;

import com.hillel.utilities.Random;

public class Coin {
    public static int headsOrTails(){
        int heads=0;
        int tails=0;

        for (int i = 0;i<2000;i++){
            int n = Random.randomizer(0,1);
            if(n==1){
                heads=heads+1;
            }
            else if(n==0){
                tails++;
            }
        }
        System.out.println("Орел: "+(heads)+" раз");
        System.out.println("Решка: "+(tails)+" раз");
        return 0;
    }
}
