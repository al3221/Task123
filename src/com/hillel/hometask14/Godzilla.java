package com.hillel.hometask14;

public class Godzilla {
    private int capacity = 1000;


    public void eat(){
        for (int i = 0; i < capacity; i++) {
            int n = i++;
            if (n == (90*capacity)/100) {
                System.out.println("Существо сыто");
                break;
            }
        }




    }
}
