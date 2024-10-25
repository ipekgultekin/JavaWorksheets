package week3examples;

import java.sql.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        this.annualInterestRate = 0.0;
        this.numberOfYears = 1;
        this.loanAmount = 1;
        this.loanDate = new Date(System.currentTimeMillis());
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date(System.currentTimeMillis());

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "annualInterestRate=" + annualInterestRate +
                ", numberOfYears=" + numberOfYears +
                ", loanAmount=" + loanAmount +
                ", loanDate=" + loanDate +
                '}';
    }
}
