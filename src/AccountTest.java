public class AccountTest {
    public static void main(String[] args) {
        Account.setAnnualInterestRate(4.5);
        Account account = new Account(1122,20000);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly interest" + account.getMonthlyInterest());
        System.out.println("Date when account was created " + account.getDateCreated());

    }
}
