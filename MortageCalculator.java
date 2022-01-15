package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Enter Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR ;


        System.out.print("Period (Years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortage = principal*
                (monthlyInterest *  Math.pow(1 + monthlyInterest,numberOfPayments))
                /(Math.pow(1 + monthlyInterest,numberOfPayments)-1);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println(mortageFormatted);

    }
}
