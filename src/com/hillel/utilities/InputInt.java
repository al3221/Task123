package com.hillel.utilities;

import java.util.Scanner;

public class InputInt {
    public static int input(){
        Scanner inpInt = new Scanner(System.in);
        int number = inpInt.nextInt();
        return number;
    }
}
