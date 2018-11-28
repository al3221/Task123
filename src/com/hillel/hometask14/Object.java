package com.hillel.hometask14;

import com.hillel.utilities.InputInt;

public class Object {
    public static void main(String[] args) {
        Godzilla big = new Godzilla();
        System.out.println("Введите, сколько порций примет Годзилла");
        int n = InputInt.input();
        for (int i = 0; i < n; i++) {
            big.eat();
        }
        big.isHungry();


    }
}
