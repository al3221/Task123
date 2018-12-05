package com.hillel.hometask14;

import com.hillel.utilities.InputInt;

public class ObjectGodzilla {
    public static void main(String[] args) {
        Godzilla big = new Godzilla();
        System.out.println("Введите, сколько людей съест Годзилла");
        int n = InputInt.input();
        big.eat(n);
    }
}

