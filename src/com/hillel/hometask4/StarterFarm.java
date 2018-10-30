package com.hillel.hometask4;

public class StarterFarm {
    public  static void main(String[] args){
        int result1 = Farm.perimeter(10,15);
        System.out.println("Периметр участка: " + result1 + " см");
        int result2 = Farm.square(10,15);
        System.out.println("Площадь участка: " + result2 + " кв.м.");

    }
}
