package com.pluralsight;

import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {

        // Mortgage formula: M = P * r * (1 + r)^N / ((1 + r)^N - 1)
        //Number of payments years * 12 to calculate the monthly payments

        //Key Variables
        //P = Loan amount (principal)
        //r = Monthly interest rate = annual interest rate ÷ 12
        //N = Total number of payments = 𝑌 * 12 for monthly payment
        //Y = number of years.
        Scanner scan = new Scanner(System.in);

// Key Variables
        //Loan amount

        System.out.print("Enter loan amount");
        double Principal = scan.nextDouble();

        //Annual interest rate
        System.out.print("Enter interest rate");
        double InterestRate = scan.nextDouble();

        //Years of the loan
        System.out.print("Enter number of years");
        int years = scan.nextInt();

        //Monthly interest calculation for monthly interest rate
        double monthlyRate = InterestRate/( 12 * 100 );

        //Converting years into the total monthly payments
        int totalPayment = years * 12;

        //Calculating (1 + r)^N
        double rate = Math.pow(1 + monthlyRate, totalPayment);





    }
}
