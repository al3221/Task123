package com.hillel.hometask6;

import com.hillel.utilities.InputInt;

public class Age {
    public static void age(){
        int year = 2018;
        System.out.print("Введите год вашего рождения: ");
        int birth = InputInt.input();
        int ag = year - birth;
        System.out.println("Ваш возраст: " + (ag-1) + " или " + (ag));

    }
}
