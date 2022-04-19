package com.company;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        //This is a popular Interview question
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        num = scanner.nextInt();
        if (num % 3==0 && num%5 ==0)
            System.out.println("FizzBuzz");
        else if (num % 3 ==0)
            System.out.println("Buzz");
        else if (num%5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(num);
    }
}
