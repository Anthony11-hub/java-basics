package com.company;

public class Arrithmetics {
    public static void man(String[] args){
        int result = 10/3;//this outputs an int and ignores the decimals
        System.out.println(result);
        /* In order to get a decimal result we have to cast the result */
        double nResult = (double)10 / (double)3;
        System.out.println(nResult);


        //Increment and decrement
        int x = 1;
        int y = x++;
        System.out.println(x);//will output 2
        System.out.println(y);//will output 1

        int t = 1;
        int z = ++t;
        System.out.println(t);//will output 2
        System.out.println(z);//will output 2

    }
}
