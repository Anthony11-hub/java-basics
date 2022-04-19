package com.company;

import java.util.Locale;

public class Strings {
    public static void main(String[] args){
        String message = new String("Hello world");
        String message1 = "Hello world " + "!!";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.startsWith("!!"));
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());//We can get rid of white spaces
        System.out.println(message);//strings are immutable, prints the original
    }
}
