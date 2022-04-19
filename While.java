package com.company;

import java.util.Locale;
import java.util.Scanner;

public class While {
    public static void main(String[] args){
        /* This is an advanced explanation of a while loop. */
        String input = "";
        //while (input != "quit") ---> this doesn't work bcoz comparison op only compare addresses and not values
        Scanner scan = new Scanner(System.in);//its best practice to put the scanner object here
        while (!input.equals("quit")){//we use the following instead
        //while (true){ --> if you use while true, make sure you have a break statement
            System.out.println("Input: ");
            //Scanner scan = new Scanner(System.in); ----> its bad practice to put the scanner here because it will pollute the memory
            //This is because in every iteration we create new scanner objects, if user enters 10 numbers we'll create 10 scanner objects
            input = scan.next().toLowerCase();//we call the toLowerCase for obvious reasons
            if (input.equals("pass"))
                continue;//moves control to the beginning of the loop
            if (input.equals("quit"))
                break;//terminates the loop
            System.out.println(input);
        }
    }
}
