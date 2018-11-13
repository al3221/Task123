package com.hillel.hometask9;

import com.hillel.utilities.Random;

public class Teams {
    public static void sumAge(){
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        System.out.print("Команда №1: ");
        for (int i = 0;i<25;i++){
            team1[i] = Random.randomizer(20 , 30);
            System.out.print(team1[i]+" ");
        }
        System.out.println();
        System.out.print("Команда №2: ");
        for (int i = 0;i<25;i++){
            team2[i] = Random.randomizer(20 , 30);
            System.out.print(team2[i]+" ");
        }
        System.out.println();
        int sum1   = 0;
        int sum2 = 0;
        int aver1 = 0;
        int aver2 = 0;

        for (int t : team1){
            sum1= sum1 + t;
        }
        aver1 = sum1/team1.length;


        for (int t : team2){
            sum2 = sum2 + t;
        }
        aver2 = sum2/team2.length;

        if (aver1>aver2){
            System.out.println("Средний возраст команды №1 "+ aver1 + " больше среднего возраста команды №2 "+aver2);
        }
        else if (aver1<aver2){
            System.out.println("Средний возраст команды №1 "+ aver1 + " меньше среднего возраста команды №2 "+aver2);
        }
        else if (aver1==aver2){
                System.out.println("Средний возраст команды №1 "+ aver1 + " равен среднему возрасту команды №2 "+aver2);
        }



    }
}
