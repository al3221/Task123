package com.hillel.hometask6;

public class OddInHundred {
    public static void oneHundred() {
        System.out.println("Нечетные числа в диапазоне от 0 до 100: ");
        for (int i = 0; i < 100; i++) {
            switch (i % 2) {
                case 1:
                    System.out.println(i);

            }
        }
    }
}
