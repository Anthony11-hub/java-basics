package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MorgageCalc2 {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scan = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scan.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scan.nextFloat();
        float monthlyInterest = annualInterest /PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period(years): ");
        byte years = scan.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)
                /(Math.pow(1+monthlyInterest, numberOfPayments) -1));
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage "+mortgageFormat);
    }
}
