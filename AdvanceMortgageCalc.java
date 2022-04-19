package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class AdvanceMortgageCalc {
    public static void main(String[] args){
        /* Principal Min = 1k - 1M
        *  Annual interest = 1-30
        *  Period = 1-30 */
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        int principal = 0;
        float rate = 0;
        int period = 0;
        double monthlyInterest =0;
        int numberOfPayments =0;

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("Principal (KES1K - KES1M): ");
            principal = scan.nextInt();

            if (principal >= 1000 && principal <= 1000_000)
                break;
            System.out.println("Enter amount between KES1K - KES1M");
        }
        while(true){
            System.out.print("Annual interest:");
            rate = scan.nextFloat();

            if (rate >= 1 && rate <= 30) {
                monthlyInterest = rate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter Annual Interest rate between 1 and 30");
        }
        while (true){
            System.out.print("Period: ");
            period = scan.nextInt();

            if (period >=1 && period <= 30) {
                numberOfPayments = period * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a period between 1 and 30");

        }
        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)
        / (Math.pow(1+monthlyInterest, numberOfPayments) -1));

        String mortgageF = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage is "+mortgageF);

    }
}
