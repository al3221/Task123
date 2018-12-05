package com.hillel.hometask15;

import com.hillel.utilities.InputInt;
import com.hillel.utilities.Random;

public class Train extends Transport {
     private int numOfWagons ;

     public Train(String model, int maxSpeed, int tmpSpeed, int numOfPassengersInOneWagon) {
         super(model, maxSpeed, tmpSpeed, numOfPassengersInOneWagon);
     }


     public void nowTmpSpeedOfTrain(){
         tmpSpeed = tmpSpeed + Random.randomizer(30,maxSpeed);
         System.out.println("Now speed " + tmpSpeed);
     }

     public void numOfPassengersInTrain(int n){
         System.out.println("Enter number of wagons " + n);
         numOfWagons = n;
         numOfPassengersInOneWagon = n*numOfPassengersInOneWagon;
         System.out.println("Number of passengers " + numOfPassengersInOneWagon);
     }

}
