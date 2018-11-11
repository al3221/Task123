package com.hillel.hometask6;

public class IndexNumders {
    public static void letterIndexes(){
        int symb = 0;
        String inStr = "Одесса мой город родной";
        int l = inStr.length();
        for(int i = 0;i<l;i++){
            inStr.charAt(i);
            symb++;
            if (inStr.charAt(i)=='о'){
                inStr.toLowerCase();
                System.out.println("Индекс: "+symb);
            }
        }
    }
}
