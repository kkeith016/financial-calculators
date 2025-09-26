package com.pluralsight;

import java.util.Scanner;

public class futureValue {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        //getting the inputs
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = scan.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double interest = scan.nextDouble();

        System.out.print("Total years: ");
        int years = scan.nextInt();

        // calculating interest to a decimal
        double rate = interest / 100.0;
        double dailyInterest = rate / 365;

        //total number of days
        int days = years * 365;

        // calculate and print
        double futureValue = depositAmount * Math.pow(1 + dailyInterest, days);
        double totalinterest = futureValue - depositAmount;
        System.out.println("----Total Breakdown----");
        System.out.println("After a total of " + years + " years");
        System.out.printf("Total Future Value: $%.2f%n", futureValue);
        System.out.printf("Total Interest Value: $%.2f%n", totalinterest);
    }
}
