package com.hillel.hometask14;

public class Godzilla {
    private int capacity = 1000;
    private int meat = 0;

    public void eat(){
        meat = meat + 50;
    }
    public int isHungry(){
            if (meat >= (90*capacity)/100) {
                System.out.println("Существо сыто");
            }
       else {
                System.out.println("Существо все еще голодное");
            }
            return meat;
    }
}
