package com.hillel.hometask7;

public class IntMinMax {
        public static int intMinNumbers(int[] aIntNums) {

            int min = aIntNums[0];
            for(int i = 0; i < aIntNums.length; i++){
                if(min > aIntNums[i]){
                    min = aIntNums[i];
                }
            }
            return min;
  }
    public static int intMaxNumbers(int[] aIntNums) {

        int max = aIntNums[0];
        for(int i = 0; i < aIntNums.length; i++){
            if(max < aIntNums[i]){
                max = aIntNums[i];
            }
        }
        return max;
    }


}


