package com.hillel.hometask10;

public class Sorting {
       public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int imin = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    imin = j;
                }
            }

            arr[imin] = arr[i];
            arr[i] = min;

        }
    }


    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
