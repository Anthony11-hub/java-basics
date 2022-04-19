package com.company;

public class Switch {
    public static void main(String[] args){
        //with switch statements, there is no limit
        String role = "admin";
        switch (role) {
            case "admin" -> System.out.println("You are an admin");
            case "moderator" -> System.out.println("You are a moderator");
            default -> System.out.println("You are a Guest");
        }
    }
}
