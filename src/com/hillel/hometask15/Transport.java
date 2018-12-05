package com.hillel.hometask15;

public class Transport {
    private String model;
    protected int maxSpeed;
    protected int tmpSpeed;
    protected int numOfPassengersInOneWagon;

    public Transport(String model, int maxSpeed, int tmpSpeed, int numOfPassengersInOneWagon) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.tmpSpeed = tmpSpeed;
        this.numOfPassengersInOneWagon = numOfPassengersInOneWagon;
    }

    public void model(){
        System.out.println("Название транспорта: "+model);
    }
}
