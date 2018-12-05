package com.hillel.hometask15;
import com.hillel.utilities.InputInt;
import com.hillel.utilities.Random;

public class Plane extends Transport {
    private String color;

    public Plane(String model, int maxSpeed, int tmpSpeed, int numOfPassengers) {
        super(model, maxSpeed, tmpSpeed, numOfPassengers);
    }

    public void nowTmpSpeedOfPlane(){
        tmpSpeed = tmpSpeed + Random.randomizer(1000,maxSpeed);
        System.out.println("Now speed " + tmpSpeed);
    }
    public void showColour(String col){
        color = col;
        System.out.println("Colour of plane " + color);
    }

}
