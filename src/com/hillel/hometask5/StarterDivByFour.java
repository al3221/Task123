package com.hillel.hometask5;

public class StarterDivByFour {
    public static void main(String[] args){
        long result = DivByFour.bitDivByFour(15.0);
        System.out.println("Результат деления на 4 при помощи побитовой операции сдвига вправо: " + result);
    }
}
