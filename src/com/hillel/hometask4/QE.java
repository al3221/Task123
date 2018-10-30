package com.hillel.hometask4;

public class QE {
    public static void solution(double a, double b, double c){
        double x1;
        double x2;
        System.out.println("Решаем квадратное уравнение");
        if (a==0||b==0){
            System.out.println("Это не квадратное уравнение");
            System.exit(0);
        }
        else if(a != 0 & b!=0){
            double d = b * b - 4 * a * c;
            if(d>0) {
                x1 = (((-b) + Math.sqrt(d)) / (2 * a));
                x2 = (((-b) - Math.sqrt(d)) / (2 * a));
                System.out.println("Ответ: " + x1 + "," + x2);
            }
            else if(d==0){
                x1 = ((-b)/(2*a));
                System.out.println("Ответ: " + x1 + "Так как дискриминант = 0");
            }
            else if(d<0){
                System.out.println("Нет решения , дискриминант = 0");
                return ;
            }
        }
        else if(c==0){
            x1 = 0;
            x2 = ((-b)/a);
            System.out.println("Ответ: " + x1 + "," + x2 + "Неполное квадратное уравнение");
        }
    }
}
