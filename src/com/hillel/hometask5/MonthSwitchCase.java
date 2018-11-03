package com.hillel.hometask5;

public class MonthSwitchCase {
    public static void switchCase(int y){
        switch (y) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима, черт возьми. Холодно, уххх");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна, вода течет, но все равно тепло");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Леееетооо, как тебя пережить то." + "\n" + "Вместе с тем не хочешь, чтоб оно уходило");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень , в небе жгут корабли");
                break;
            default :
                System.out.println("Нет такого времени,но мы придумаем");
                break;
        }

    }
}
