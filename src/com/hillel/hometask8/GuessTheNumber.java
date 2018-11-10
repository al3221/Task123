package com.hillel.hometask8;

import com.hillel.utilities.InputInt;
import com.hillel.utilities.Random;

public class GuessTheNumber {
    public static void guess(){
        System.out.println("Угадай число от 1 до 10");

        int guessedNumber = Random.randomizer(1,10);


        boolean b = true;
        while (b){
            int inputNumber = InputInt.input();
            if(guessedNumber==inputNumber){
                System.out.println("You Goddamn right");
                break;
            }
            else if(guessedNumber > inputNumber){
                System.out.println("Не угадал. Ты ввел число меньше. Давай еще раз");
            }
            else if(guessedNumber < inputNumber){
                System.out.println("Не угадал. Ты ввел число больше. Давай еще раз ");
            }

        }

    }
}
