package com.hillel.hometask8;

import com.hillel.utilities.InputInt;

public class Factorial {
    public static void fact(){
        System.out.print("Факториал числа: ");
        int ournumber = InputInt.input();
        int result=1;

        for(int i = 1;i <= ournumber;i++){
            result = result*i;
        }
        System.out.println(result);
    }
}
