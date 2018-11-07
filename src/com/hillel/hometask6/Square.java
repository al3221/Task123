package com.hillel.hometask6;

public class Square {
    public static void square(){
        for(int i = 1;i<=5;i++){
            for(int j=1;j<=5;j++){
                    if(i==j){
                        System.out.print(1);
                    }
                    else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
