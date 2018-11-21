package com.hillel.hometask9;

public class InverseMinMax {
    public static void invMinMax(int[] inMinMax) {
        int min = inMinMax[0];
        int imin = 0;
        int max = inMinMax[0];
        int imax = 0;


        for(int i = 0;i<inMinMax.length;i++) {

                if (min > inMinMax[i]) {
                    min = inMinMax[i];
                    imin = i;
                }
                if (max < inMinMax[i]) {
                    max = inMinMax[i];
                    imax = i;
                }


            }
        inMinMax[imin] = max;
        inMinMax[imax] = min ;

        for(int i = 0;i<inMinMax.length;i++){
            System.out.print(inMinMax[i]+" ");
        }
    }



}
