package com.hillel.hometask14;

import com.hillel.utilities.InputInt;

public class ObjectGodzilla {
    public static void main(String[] args) {
        Godzilla g = new Godzilla();
        while (true) {
            System.out.println("Введите сколько нужно съесть Годзилле сейчас?");
            int vol = InputInt.input();

            g.eat(vol);
            g.showCurrentVolume();
            if (!g.isHungry()) {
                break;
            }
        }
    }
}

