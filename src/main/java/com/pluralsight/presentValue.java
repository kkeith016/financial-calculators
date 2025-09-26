package com.pluralsight;

import java.util.Scanner;

public class presentValue {
    public static void main(String[] args) { ;
Scanner scan = new Scanner(System.in);

//user inputs

        System.out.print("Enter the monthly payout");
        int monthlyPayout = scan.nextInt();

        System.out.print("Enter the annual interest rate");
        int rate = scan.nextInt();

        System.out.print("Enter the number of years");
        int year = scan.nextInt();

        double monthlyRate = rate / 100 / 12;
        int totalPayments = year * 12;

        // Math


    }
}
