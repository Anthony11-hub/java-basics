package com.company;

import com.sun.source.tree.SynchronizedTree;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age:");
        byte age = scanner.nextByte();
        System.out.println("Your age is " + age);//This is implicit casting

        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        String name = scan.nextLine();
        System.out.println("Your name is "+name);

    }
}
