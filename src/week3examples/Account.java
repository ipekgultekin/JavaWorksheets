package week3examples;

public class Account {
    private int accountNo;
    private float balance;

    public Account() {
        accountNo = 1;
        balance = 0;
    }

    public Account(int accountNo, float balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void withdraw(float amount) {
        if(amount > balance) {
            return;
        }
        else{
            balance = balance - amount;

        }
        System.out.println("Insufficient amount");
    }

    public void deposit(float amount) {
        balance = balance + amount;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", balance=" + balance +
                '}';
    }
}
