package com.hillel.hometask14;
import java.util.Scanner;

public class Godzilla {
    private final int FIXED_EATEAN_VOL = 50;
    private final int MAX_VOLUME = 1000;
    private final int MIN_LIMIT = MAX_VOLUME - (90*MAX_VOLUME)/100; // treshold
    private  int currentVolume = MAX_VOLUME;

    public void eat(int number) {
        int eteanVolume = number * FIXED_EATEAN_VOL;
        if ((currentVolume - eteanVolume) > MIN_LIMIT) {
            System.out.println("I neeed more");
            currentVolume = currentVolume - eteanVolume;
        } else if ((currentVolume - eteanVolume) <= MIN_LIMIT && (currentVolume - eteanVolume)>=0){
            System.out.println("ALARM, I don't want to eat, I am not hungry! ");
            currentVolume = currentVolume - eteanVolume;
        }
        else if ((currentVolume - eteanVolume)<0){
            System.out.println("Too much, let's go again");
        }
    }

    public boolean isHungry() {
        return (currentVolume> MIN_LIMIT || currentVolume<0);
    }

    public void showCurrentVolume() {
        System.out.println(currentVolume);
    }

}

