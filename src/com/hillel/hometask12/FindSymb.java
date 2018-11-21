package com.hillel.hometask12;

public class FindSymb {
    public static boolean contains(int[] a,  int n){
        int start = 0;
        int end = a.length-1;
        int i = 0;
        while(i<a.length) {
            int mid = (start+end)/2;
            if(n==a[mid]){
                return true;
            }
            else {
                if(n>a[mid]){
                    start = start +1;
                }
                else if(n<a[mid]){
                    end = mid - 1;
                }
            }
            i++;
        }
        return false;

    }


}