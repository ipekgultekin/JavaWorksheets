package week2examples;

import java.util.Scanner;

public class ATMSimulation {
//this file related to week2examples.Account_TryCatch and week2examples.Account_TryCatch test files.
    public static void showMenu(Account account, Scanner input){
        System.out.println("Welcome to week2examples.ATMSimulation");
        int choice = 0;

        while(choice !=4) {
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The balance is " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    int amount = input.nextInt();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount to deposit: ");
                    int amountDeposit = input.nextInt();
                    account.deposit(amountDeposit);
                    break;
                case 4:
                    System.out.println("Exit the program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i,50);
        }
        while (true) {
            System.out.println("Enter an account id: ");
            int id = input.nextInt();

            while(id < 0 || id > accounts.length) {
                System.out.println("Invalid id. Please try again. ");
                System.out.println("Enter an account id: ");
                id = input.nextInt();
            }

            showMenu(accounts[id], input);
        }

    }
}
