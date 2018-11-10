package com.hillel.hometask4;

public class StarterConverter {
    public static void main(String[] args) {
        long our_sum_dollar;
        our_sum_dollar = Converter.dollarinhryvnia(100);
        System.out.println("Наша сумма: " + our_sum_dollar + " гривен. Сумма кратна копейкам");
        long our_sum_hryvnia = Converter.hryvniaindollar(2818000);
        System.out.println("Наша сумма: " + our_sum_hryvnia + " гривен. Сумма кратна копейкам");
    }
}
