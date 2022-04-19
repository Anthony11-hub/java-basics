package com.company;

public class Compare {
    public static void main(String[] args){
        /* Comparison Operators   >,<,>=,<=,==,!=
        *  Logical Operators &&, ||,  */
        int income = 120_000;
        String className = "Economy";
        if (income > 100_000)
            className = "First";
            System.out.println(className);
        //Ternary Operator to simplify above code
        int income2 = 20_000;
        String className1 = income2 > 100_000 ? "First" : "Economy";
        System.out.println(className1);
    }
}
