package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args){
        /* Principal, Annual Interest Rate, Period(yrs)
        * This program takes the above as inputs and displays them as a currency
        * M=p*((r(1+r)^n)/((1+r)^n-1))*/
        double principal;
        double interest;
        int period;

        Scanner scan = new Scanner(System.in);

        System.out.print("Principal: ");
        System.out.print("\nAnnual Interest: ");
        System.out.println("\nPeriod(Years): ");

        principal = scan.nextDouble();
        interest = scan.nextDouble();
        period = scan.nextInt();

        double time = period*12;
        double rate = interest/12/100;
        System.out.println("Your Rate is per month is..... "+rate);
        double mortgage = principal * (rate * Math.pow(1+rate,time)/(Math.pow(1+rate, time)-1));
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Dear Customer, Your Mortgage is "+result);
    }
}
