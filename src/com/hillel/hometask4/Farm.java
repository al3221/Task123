package com.hillel.hometask4;

public class Farm {
    public static int perimeter(int l, int w){
        if(l<=0 || w<=0){
            System.out.println("Ошибка");
            System.exit(0);
            
        }
        else {
            int p = (l + w) * 2;
            int result = p;
            return p;
        }
        return 0;
    }
    public static int square(int l, int w){
        if(l<=0 || w<=0){
            System.out.println("Ошибка");
            System.exit(0);
        }
        else {
            int p = l * w;
            int result = p;
            return p;
        }
        return 0;
    }
}
