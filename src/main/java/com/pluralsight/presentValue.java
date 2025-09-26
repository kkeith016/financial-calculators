package com.pluralsight;

import java.util.Scanner;

public class presentValue {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//user inputs

        System.out.print("Enter the monthly payout ");
        double monthlyPayout = scan.nextDouble();

        System.out.print("Enter the annual interest rate ");
        double rate = scan.nextDouble();

        System.out.print("Enter the number of years ");
        double year = scan.nextDouble();

        double monthlyRate = rate / (100 /12);
        double totalPayments = year * 12;

        // Math
double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyRate, -totalPayments))/monthlyRate;
System.out.printf("Present Value of Annuity: $%.2f%n", presentValue);


    }
}
