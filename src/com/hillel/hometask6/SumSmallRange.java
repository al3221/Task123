package com.hillel.hometask6;

import com.hillel.utilities.Random;

public class SumSmallRange {
    public static void smallRange(){
        int sum = 0;
        for(int i =0;i<100;i++){
            int n = Random.randomizer(-10,9);
            sum = sum + n;
            System.out.println(n);
        }
        System.out.println("Сумма чисел: "+sum);
    }
}
