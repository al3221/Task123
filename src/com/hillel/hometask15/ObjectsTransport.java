package com.hillel.hometask15;

public class ObjectsTransport {
    public static void main(String[] args) {
        Train train = new Train("KirovZhD-13" ,150,0,50);
        train.model();
        train.nowTmpSpeedOfTrain();
        train.numOfPassengersInTrain(5);

        System.out.println();

        Plane plane = new Plane("MIG-25",1500,0,250);
        plane.model();
        plane.nowTmpSpeedOfPlane();
        plane.showColour("Blue");
        //
    }
}
