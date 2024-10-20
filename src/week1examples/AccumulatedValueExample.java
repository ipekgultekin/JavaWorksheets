package week1examples;

import java.util.*;
import java.lang.Math;

public class AccumulatedValueExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        int investmentAmount = input.nextInt();

        System.out.println("Enter annual interest rate: ");
        double interestRate = input.nextDouble();

        System.out.println("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Accumulated value is " + accumulatedValue(investmentAmount, interestRate, numberOfYears));
    }

    public static double accumulatedValue(int investmentAmount, double interestRate, int numberOfYears) {
        double monthlyInterestRate;
        monthlyInterestRate = (interestRate / 12000);
        return investmentAmount*Math.pow(1 + monthlyInterestRate, numberOfYears*12);
    }
}
