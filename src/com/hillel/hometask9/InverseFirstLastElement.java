package com.hillel.hometask9;

public class InverseFirstLastElement {
    public static void invArray(char[] chArr) {

        char num = 0;
        char first = chArr[0];
        char last = 0;

        System.out.print("Наш массив: ");

        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + " ");
        }
        System.out.println();
        System.out.print("Поменяли первый и последний элемент массива: ");

        for (int i = 0; i <chArr.length; i++) {

            if(i==chArr.length-1){
                last =first;
                first = chArr[i];
            }
        }

        System.out.print(first+" ");

        for(int i = 1;i<chArr.length-1;i++) {
        if (i != chArr.length-1 && i != 0) {
                num = chArr[i];
                System.out.print(num+" ");
            }
        }

        System.out.print(last);
    }
}


