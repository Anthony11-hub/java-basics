package com.company;

import java.text.NumberFormat;

public class Formatting {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();//This is a factory method
        String result = currency.format(123456789.456);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);

        //Another technique -- Method chaining
        String result3 = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(result3);
    }
}
