package com.company;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Input: ");
            input = scanner.next();
            System.out.println(input);

        }while(!input.equals("quit"));
    }
}
