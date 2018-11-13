package com.hillel.hometask9;

public class Numbers {
    public static int evenNumbers(int[] evNotEvNumber){
        int sum = 0;

       for (int i = 0; i<evNotEvNumber.length;i++){
           if(evNotEvNumber[i]%2==0){
               sum = sum + evNotEvNumber[i];
           }
       }
       return sum;
    }
    public static int notEvenNumbers(int[] evNotEvNumber){
        int sum = 0;


        for (int i = 0; i<evNotEvNumber.length;i++){
            if(evNotEvNumber[i]%2==1){
                sum = sum + evNotEvNumber[i];
            }
        }
        return sum;
    }
    public static void array(int[] evNotEvNumber){
        int l = evNotEvNumber.length;
        System.out.print("Наш массив: ");
        for(int i=0;i<l;i++){
            System.out.print(evNotEvNumber[i]+" ");
        }
    }
}

