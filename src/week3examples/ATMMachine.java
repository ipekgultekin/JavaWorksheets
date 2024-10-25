package week3examples;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class ATMMachine {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(1,50);
        SavingsAccount savingsAccount2 = new SavingsAccount(2,50);
        SavingsAccount savingsAccount3 = new SavingsAccount(3,50);

        CheckingsAccount checkingsAccount4 = new CheckingsAccount(4,50,50);
        CheckingsAccount checkingsAccount5 = new CheckingsAccount(5,50,50);
        CheckingsAccount checkingsAccount6 = new CheckingsAccount(6,50,50);

        Account account7 = new Account(7,50);
        Account account8 = new Account(8,50);
        Account account9 = new Account(9,50);
        Account account10 = new Account(10,50);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(savingsAccount1);
        accounts.add(savingsAccount2);
        accounts.add(savingsAccount3);
        accounts.add(checkingsAccount4);
        accounts.add(checkingsAccount5);
        accounts.add(checkingsAccount6);
        accounts.add(account7);
        accounts.add(account8);
        accounts.add(account9);
        accounts.add(account10);

        System.out.println("Enter an account id: ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if(id>10 || id<1){
            System.out.println("Invalid account id");
        }
        else {
            int choice;
            do {

                System.out.println("Main menu:\n" +
                        "1: check balance\n" +
                        "2: withdraw\n" +
                        "3: deposit\n" +
                        "4: exit");
                System.out.println("Enter a choice: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts.get(id).getBalance());
                        break;
                    case 2:
                        System.out.println("Enter an amount to withdraw: ");
                        float amount = input.nextFloat();
                        accounts.get(id).withdraw(amount);
                        System.out.println("The withdrawn is " + accounts.get(id).getBalance());
                        break;
                    case 3:
                        System.out.println("Enter an amount to deposit: ");
                        amount = input.nextFloat();
                        accounts.get(id).deposit(amount);
                        System.out.println("The deposited is " + accounts.get(id).getBalance());
                        break;
                    case 4:
                        System.out.println("Byee!");
                }
            }while(choice != 4);

        }


    }
}
