package com.hillel.hometask15;

public class ObjectsTransport {
    public static void main(String[] args) {
        Train train = new Train("Donbass DNR150" ,150,0,50);
        train.model();
        train.nowTmpSpeedOfTrain();
        train.numOfPassengersInTrain(5);

        System.out.println();

        Plane plane = new Plane("RussianWorld C2H5OH",1500,0,250);
        plane.model();
        plane.nowTmpSpeedOfPlane();
        plane.showColour("Blue");
        //
    }
}
