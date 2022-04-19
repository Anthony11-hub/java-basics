package com.company;

public class Casting {
    public static void main(String[] args){
        //implicit casting == automatic casting
        //we can cast byte > short > int > long > float > double
        short x = 1;
        int y = x +2;
        System.out.println(y);//output will bw 3 as expected

        //Explicit casting -- only happens with compatible types listed above
        double t = 1.2;
        int z = (int)t + 2;
        System.out.println(z);// here we will get 3

        String r = "1";//for this to work, this must also be an integer
        int w = Integer.parseInt(r) + 2;//Primitive type for the int class
        //Short.parseShort();
        //Double.parseDouble();
        //Float.parseFloat();
        System.out.println(w);
    }
}
