package com.hillel.hometask9;

public class Reverse {
    public static void revArray(double[] reAr){

        double num = 0;
        int l = reAr.length - 1;
        System.out.print("Наш массив: ");

        for (int i = 0;i<reAr.length;i++){
            System.out.print(reAr[i]+" ");
        }

        System.out.println();

        System.out.print("В обратном порядке: ");

        for (int i=l;i>-1;i--){
                num = reAr[i];
                System.out.print(num+" ");

        }

    }
}
