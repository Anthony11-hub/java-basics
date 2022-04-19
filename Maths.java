package com.company;

public class Maths {
    public static void main(String[] args){
        int result = Math.round(1.1F);
        int result2 = (int)Math.ceil(1.1F);
        int result3 = (int)Math.floor(1.1F);
        int result4 = Math.max(1,2);
        double result5 = Math.random();
        int result6 = (int) Math.round(Math.random() * 100);
        System.out.println(result);
    }
}
