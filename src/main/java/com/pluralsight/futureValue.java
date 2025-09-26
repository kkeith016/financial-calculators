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
        double rate = interest/100.0;
        double dailyInterest = rate / 365;



    }
}
