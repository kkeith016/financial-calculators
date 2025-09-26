package com.pluralsight;

import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Mortgage formula: M = P * r * (1 + r)^N / ((1 + r)^N - 1)
        //Number of payments years * 12 to calculate the monthly payments

        //Key Variables
        //P = Loan amount (principal)
        //r = Monthly interest rate = annual interest rate ÷ 12
        //N = Total number of payments = 𝑌 * 12 for monthly payment
        //Y = number of years.

        //Loan amount

        System.out.print("Enter loan amount");
        double principal = scan.nextDouble();

        //Annual interest rate
        System.out.print("Enter interest rate");
        double interestRate = scan.nextDouble();

        //Years of the loan
        System.out.print("Enter number of years");
        int years = scan.nextInt();

        //Monthly interest calculation for monthly interest rate
        double monthlyRate = interestRate/( 12 * 100 );

        //Converting years into the total monthly payments
        int totalPayment = years * 12;

        //Calculating (1 + r)^N
        double rate = Math.pow(1 + monthlyRate, totalPayment);

        // Applying Mortgage formula
        double monthlyPayment = (principal * monthlyRate * rate)/(rate -1);

        // Display the results
        System.out.println("-----Breakdown-----");
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);

        //Total interest and total paid over the course of the loan.
        double totalPaid = monthlyPayment * totalPayment;
        double totalInterest = totalPaid - principal;

        // Printing our interest and total paid over the course of the loan
        System.out.printf("Total Paid Over Loan: $%.2f%n", totalPaid);
        System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);





    }
}
