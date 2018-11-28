package com.hillel.hometask9;

import com.hillel.hometask4.Number;

public class StarterNumber {
    public static void main(String[] args) {
        int[] num = {12,17,16,13,18,11,13,14,7,8};
        Numbers.array(num);

        System.out.println();
        int result1 = Numbers.evenNumbers(num);

        System.out.println("Сумма четных чисел массива: "+result1);
        int result2 = Numbers.notEvenNumbers(num);
        System.out.println("Сумма нечетных чисел массива: "+result2);

        int result3 = result1 - result2;
        System.out.println("sum(четные) - sum(нечетные) = " + result3);
    }
}
