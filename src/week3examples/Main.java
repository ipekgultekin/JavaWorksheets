package week3examples;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CheckingsAccount checkingsAccount1 = new CheckingsAccount(1,100,100);
        CheckingsAccount checkingsAccount2 = new CheckingsAccount(2,100,100);

        SavingsAccount savingsAccount1 = new SavingsAccount(3,100);
        SavingsAccount savingsAccount2 = new SavingsAccount(4,100);

        ArrayList<Account> accounts = new ArrayList<>();//polymorphism
        accounts.add(checkingsAccount1);
        accounts.add(checkingsAccount2);
        accounts.add(savingsAccount1);
        accounts.add(savingsAccount2);

        for(Account account : accounts) {
            account.withdraw(200);
            System.out.println(account);
        }
    }
}
