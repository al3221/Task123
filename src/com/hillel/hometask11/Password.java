package com.hillel.hometask11;


import com.hillel.utilities.Random;

public class Password {
        private static char[] ourPassword = new char [8];
        public static void pass(){
                String lowSymb = "abcdefghijklmnopqrstuvwxyz";
                char[] arrayLowSymb = lowSymb.toCharArray();
                String bigSymb = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                char[] arrayBigSymb = bigSymb.toCharArray();
                String numb = "0123456789";
                char[] arrayNumb = numb.toCharArray();
                String ourSymb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
                char[] arrayOurSymb = ourSymb.toCharArray();

                for (int i = 0; i < ourPassword.length; i++) {
                        ourPassword[i] = '.';
                }


                ourPassword[Random.randomizer(0,ourPassword.length-1)] = arrayLowSymb[Random.randomizer(0,arrayLowSymb.length-1)];
                if(ourPassword[Random.randomizer(0,ourPassword.length-1)] == '.'){
                        ourPassword[Random.randomizer(0,ourPassword.length-1)] = arrayBigSymb[Random.randomizer(0,arrayBigSymb.length-1)];
                }
                if(ourPassword[Random.randomizer(0,ourPassword.length-1)] == '.'){
                        ourPassword[Random.randomizer(0,ourPassword.length-1)] = arrayNumb[Random.randomizer(0,arrayNumb.length-1)];
                }
                for (int i = 0; i < ourPassword.length; i++) {
                        if(ourPassword[i]=='.'){
                                ourPassword[i] = arrayOurSymb[Random.randomizer(0,arrayOurSymb.length-1)];
                        }
                        System.out.print(ourPassword[i]);
                }
        }
}
//    private static char[] ourPassword = new char [8];
//
//    public static void pass(){
//
//    String lowSymb = "abcdefghijklmnopqrstuvwxyz";
//    char[] arrayLowSymb = lowSymb.toCharArray();
//    String bigSymb = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    char[] arrayBigSymb = bigSymb.toCharArray();
//    String numb = "0123456789";
//    char[] arrayNumb = numb.toCharArray();
//    String ourSymb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
//
//
//      ourPassword[1] = arrayLowSymb[Random.randomizer(0,arrayLowSymb.length)];
//      ourPassword[2] = arrayBigSymb[Random.randomizer(0,arrayBigSymb.length)];
//      ourPassword[3] = arrayNumb[Random.randomizer(0,arrayNumb.length)];
//      for (int i = 4 ; i < ourPassword.length();i++ ){
//          i = Random.randomizer(0,ourSymb.length());
//      }
//
//        System.out.println(ourPassword);
//    }
//    public static void main(String[] args) {
//      pass();
//    }
//}
