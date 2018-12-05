package com.hillel.hometask14;

import com.hillel.utilities.InputInt;

public class Godzilla {
    private final int FIXED_EATEAN_VOL = 50;
    private final int MAX_VOLUME = 1000;
    private final int MIN_LIMIT = (90*100)/MAX_VOLUME;
    private int currentVolume = MAX_VOLUME;

    public void eat(int number){
        int eteanVolume = number * FIXED_EATEAN_VOL;
        if ((currentVolume - eteanVolume) >= MIN_LIMIT) {
            currentVolume = currentVolume - eteanVolume;
        } else {
            System.out.println("ALARM, I don't want to eat, I am not hungry! ");
        }

    }

}


